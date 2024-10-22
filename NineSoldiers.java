// Esau
// Abdu-Raziq
// 4270797
// CSC311 2024 AI Practical 
import java.io.*;
import java.util.*;
import java.io.BufferedReader;

public class NineSoldiers
{
    static class State
    {
        int[] cell;
        int hV;

        State(int[] cell, int hV)
        {
            this.cell = cell;
            this.hV = hV;
        }

        @Override
        public int compTo(State o)
        {
            return this.hV - o.hV;
        }

        public int getHV()
        {
            return hV;
        }
        public void setHV(int hV)
        {
            this.hV = hV;
        }

        public int[] getCell()
        {
            return cell;
        }
        public void setCell( int[] cell)
        {
            this.cell = cell;
        }

        public void prState()
        {
            System.out.println("h = " + hV);
            for (int i = 1; i < cell.length; i++)
            {
                System.out.println(cell[i] + " ");
                if (i%3 == 0)
                {
                    System.out.println();
                }
            }
        }

        public List<State> genChild()
        {
            List<State> child = new ArrayList<>();
            return child;
        }
    }

    static class StateComp implements Comp<State>
    {
        public int compare(State a, State b)
        {
            return a.getHV() - b.getHV();
        }
    }

    static State rInitial(String filename) throws IOException
    {
        return null;
    }

    static void bFS (State inState)
    {
        PriorityQueue<State> openList = new PriorityQueue<>(new StateComp());
        Set<State> closedList = new HashSet<>();
        openList.offer(inState);

        while (!openList.isEmpty())
        {
            State curState = openList.poll();
            curState.prState();
            closedList.add(curState);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            State inState = rInitial("initial_state.txt");
            bFS(inState);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}