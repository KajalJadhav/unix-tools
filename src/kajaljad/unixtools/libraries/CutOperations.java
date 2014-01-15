package kajaljad.unixtools.libraries;

public class CutOperations {
    public String cutByCharacter(int number, String text) {
        String[] result = text.split("\r\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.length; i++)
            stringBuilder.append(result[i].substring(number - 1, number)).append("\r\n");
        return stringBuilder.toString();
    }

    public String cutByField(String text) {
        String[] result = text.split("\r\n");
        StringBuilder fields = new StringBuilder();
        for (String aResult : result)
            fields.append(aResult).append("\r\n");
        return fields.toString();
    }

    public String cutByFieldAndSeparator(int fieldNumber, String seperator, String text) {
        String[] result = text.split("\r\n");
        StringBuilder cut = new StringBuilder();
        for (String aResult : result) {
            String[] data = aResult.split(seperator);
            if (data.length < fieldNumber)
                cut.append("\r\n");
            else cut.append(data[fieldNumber - 1]).append("\r\n");
        }
        return cut.toString();
    }

}