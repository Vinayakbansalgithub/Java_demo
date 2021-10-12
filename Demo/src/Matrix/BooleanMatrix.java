package Matrix;

import java.io.IOException;


import com.fasterxml.jackson.databind.ObjectMapper;

public class BooleanMatrix {

	public static int[][] modifyMatrix(int mat[][], int R, int C) {

		int temp[][] = new int[3][4];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {

				if (mat[i][j] == 1) {

					int r = 0;
					int c = j;
					while (r < R) {

						temp[r++][c] = 1;

					}
					r = i;
					c = 0;
					while (c < C) {

						temp[r][c++] = 1;

					}

				}

			}
		}

		mat = temp;
		return mat;

	}

	public static void printMatrix(int mat[][], int R, int C) {
		int i, j;
		for (i = 0; i < R; i++) {
			for (j = 0; j < C; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		
		
		String input="{\n"
				+ "  \"consumers\": {\n"
				+ "    \"name\": [\n"
				+ "      {\n"
				+ "        \"identifier\": \"current\",\n"
				+ "        \"firstName\": \"SHEMICA\",\n"
				+ "        \"lastName\": \"XXSHJF\",\n"
				+ "        \"middleName\": \"FAYE\",\n"
				+ "        \"suffix\": \"X\"\n"
				+ "      }\n"
				+ "    ],\n"
				+ "    \"socialNum\": [\n"
				+ "      {\n"
				+ "        \"identifier\": \"current\",\n"
				+ "        \"number\": \"666795307\"\n"
				+ "      }\n"
				+ "    ],\n"
				+ "    \"dateOfBirth\": \"04281987\",\n"
				+ "    \"addresses\": [\n"
				+ "      {\n"
				+ "        \"identifier\": \"current\",\n"
				+ "        \"houseNumber\": \"7249\",\n"
				+ "        \"streetName\": \"PAJJ ZAFW\",\n"
				+ "        \"streetType\": \"LN\",\n"
				+ "        \"apartmentNumber\": \"12\",\n"
				+ "        \"city\": \"HUMBLE\",\n"
				+ "        \"state\": \"TX\",\n"
				+ "        \"zip\": \"77396\"\n"
				+ "      }\n"
				+ "    ],\n"
				+ "    \"phoneNumbers\": [\n"
				+ "      {\n"
				+ "        \"identifier\": \"current\",\n"
				+ "        \"number\": \"4585856325\"\n"
				+ "      }\n"
				+ "    ],\n"
				+ "    \"employments\": {\n"
				+ "      \"occupation\": \"VELLA\",\n"
				+ "      \"employerName\": \"XYZ\"\n"
				+ "    }\n"
				+ "  },\n"
				+ "  \"customerReferenceIdentifier\": \"JSON\",\n"
				+ "  \"customerConfiguration\": {\n"
				+ "    \"equifaxUSConsumerCreditReport\": {\n"
				+ "      \"memberNumber\": \"999XX00000\",\n"
				+ "      \"securityCode\": \"XXX\",\n"
				+ "      \"codeDescriptionRequired\": true,\n"
				+ "      \"models\": [\n"
				+ "        {\n"
				+ "          \"identifier\": \"02583\"\n"
				+ "        }\n"
				+ "      ],\n"
				+ "      \"endUserInformation\": {\n"
				+ "        \"endUsersName\": \"ALABASTER INC\",\n"
				+ "        \"permissiblePurposeCode\": \"01\"\n"
				+ "      },\n"
				+ "      \"customerCode\": \"BQ81\",\n"
				+ "      \"multipleReportIndicator\": \"F\",\n"
				+ "      \"ECOAInquiryType\": \"Individual\",\n"
				+ "      \"pdfComboIndicator\": \"Y\",\n"
				+ "      \"optionalFeatureCode\": [\n"
				+ "        \"X\"\n"
				+ "      ],\n"
				+ "      \"vendorIdentificationCode\": \"FI\"\n"
				+ "    }\n"
				+ "  }\n"
				+ "} ";
		
		input="hh";
		boolean isVa=	isJSONValidd(input);
		
		System.out.println(isVa);
		
		
//		int mat[][] = { { 0, 0, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, };
//
//		System.out.println("Matrix Intially");
//
//		printMatrix(mat, 3, 4);
//
//		mat = modifyMatrix(mat, 3, 4);
//		System.out.println("Matrix after modification n");
//		printMatrix(mat, 3, 4);

	}

	
	
	public static boolean isJSONValidd(String jsonInString ) {
	    try {
	       final ObjectMapper mapper = new ObjectMapper();
	       mapper.readTree(jsonInString);
	       return true;
	    } catch (IOException e) {
	       return false;
	    }
	  }
}
