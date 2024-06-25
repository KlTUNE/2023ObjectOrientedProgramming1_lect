package jp.ac.ait.k22121;
public class Manager {
    private int count;
    private Answer answer;
    public Manager(){
        answer = new Answer();
        count = 0;
    }
    public int getCount(){
        return  count;
    }
    public Answer getAnswer(){
        return answer;
    }
    public Response solve(String in){
        Response response = new Response();
        int hit=0, blow=0;

        count ++;
        for (int i=0;i<Answer.DIGITS;i++){
            if (getAnswer().get().charAt(i) == in.charAt(i)) hit ++;
            else blow ++;
        }

        response.setHit(hit);
        response.setBlow(blow);

        return  response;
    }
}
