<?php 
   
//Get comments from last 4 weeks. This will test if comments are stored in WordPress comments
  //section.

  $args = array(
              'date_query' => array(
                                    'after' => '4 weeks ago',
                                    'before' => 'tomorrow',
                                    'inclusive' => true,
                              ),
               );
  
  $allComments = get_comments($args);
  
  //displays all comments here
  foreach ($allComments as $allComments) {
    echo $allComments;
  }
?>
