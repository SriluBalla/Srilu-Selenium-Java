package tests;

import helpers.arrayHelper;
import helpers.constants;

public class useArrays {

    public static void main(String[] args) {

        arrayHelper.listNumbers(constants.number);
        arrayHelper.sortNumbers(constants.number);
        arrayHelper.removeDuplicates(constants.number);

    }
}