// check if given index is attacked or not //
boolean isAttack(int i, int j) {

  if (checkRows(i, j))
    return true;
     if(checkColumns(i, j))
       return true;
    if( checkDiagonal(i, j))
    return true;

  return false;

} // end isAttack

boolean checkRows(int i, int j) {

  // ******* 1: traverse Row by Row *******
  for (int k = 0; k < board.length; k++)
    if (board[i][k] == 1 && k != j)
      return true;

  return false;

} // end checkRows

boolean checkColumns(int i, int j) {

  // ******* 2 : traverse COLUMN BY COLMUN *******
  for (int k = 0; k < board.length; k++)
    if (board[k][j] == 1 && k != i)
      return true;
  return false;

} // end checkColumns

boolean checkDiagonal(int i, int j)

{
  int iP = i + 1; // i positive i++
  int jP = j + 1;// j positive j++

  int iM = i - 1; // i negative  i--
  int jM = j - 1; // j negative i--

      // case i++ j-- i.e: down left side
  for (int n = iP, m = jM; n < board.length && m >= 0; n++, m--)
    if (board[n][m] == 1)
      return true;

  // case i++ j++ i.e: down right side
  for (int n = iP, m = jP; n < board.length && m < board.length; n++, m++)
    if (board[n][m] == 1)
      return true;

  // case i-- j++ i.e: up right side
  for (int n = iM, m = jP; n >= 0 && m < board.length; n--, m++)
    if (board[n][m] == 1)
      return true;

  // case i-- j-- i.e: up left side
  for (int n = iM, m = jM; n >= 0 && m >= 0; n--, m--)
    if (board[n][m] == 1)
      return true;

  return false;

} // end check Diagonal
