  static bool randomInitialized = false;
    int point;
     if (!randomInitialized)
     {
         srand((unsigned int)time(NULL));
         
     }
    point = (rand()%6) +1;
    return point;
    
    //    total = roll() + roll();
//    cout << "Roll Dice results: " << endl;
//    cout << "Die one: " << roll() <<endl;
//    cout << "Die Two: " << roll()<< endl;
//    cout << "Total roll: " << total <<endl;
//