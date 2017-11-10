package test;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;


public class ComputeArray {
	
	public static void main(String args[]) {
	    String nextAlphaSequence = null;
	    for (int index = 0; index < 2000; index++) {
	        nextAlphaSequence = getNextAlphaCharSequence(nextAlphaSequence);
	        
	        //only Print out starting at "AAA"
	        if(index > 701 )
	        	System.out.print("\"" + nextAlphaSequence + "\"" + ",");
	    }
	}
	
	public static String getNextAlphaCharSequence(String charSeqStr) {

	    String nextCharSeqStr       = null;
	    char[] charSeqArr           = null;
	    boolean isResetAllChar      = false;
	    boolean isResetAfterIndex   = false;
	    Integer resetAfterIndex     = 0;

	    if (StringUtils.isBlank(charSeqStr)) {
	        charSeqArr = new char[] { 'A' };
	    } else {
	        charSeqArr = charSeqStr.toCharArray();
	        Integer charSeqLen = charSeqArr.length;

	        for (int index = charSeqLen - 1; index >= 0; index--) {
	            char charAtIndex = charSeqArr[index];

	            if (Character.getNumericValue(charAtIndex) % 35 == 0) {
	                if (index == 0) {
	                    charSeqArr = Arrays.copyOf(charSeqArr, charSeqLen + 1);
	                    isResetAllChar = true;
	                } else {
	                    continue;
	                }
	            } else {
	                char nextCharAtIndex = (char) (charAtIndex + 1);
	                charSeqArr[index] = nextCharAtIndex;
	                if (index + 1 < charSeqLen) {
	                    isResetAfterIndex = true;
	                    resetAfterIndex = index;
	                }
	                break;
	            }
	        }
	        charSeqLen = charSeqArr.length;
	        if (isResetAllChar) {
	            for (int index = 0; index < charSeqLen; index++) {
	                charSeqArr[index] = 'A';
	            }
	        } else if (isResetAfterIndex) {
	            for (int index = resetAfterIndex + 1; index < charSeqLen; index++) {
	                charSeqArr[index] = 'A';
	            }
	        }
	    }

	    nextCharSeqStr = String.valueOf(charSeqArr);
	    return nextCharSeqStr;
	}

	
	

}
