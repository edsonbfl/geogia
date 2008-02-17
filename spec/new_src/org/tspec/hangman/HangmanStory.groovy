package org.tspec.hangman

import org.tspec.hangman.Hangman

เรื่อง 'คนแขวนคอ'

อธิบาย 'การตั้งค่าที่เหมาะสมสำหรับเริ่มต้น',{	
	กำหนดให้ 'มีวัตถุคนแขวนคอ', {
		hangman = new Hangman()
	}
	เมื่อ 'ตั้งค่าคำไว้เป็นค่า hello',{
		hangman.word = 'hello'
	}
	แล้ว 'ตัววัตถุควรมีการตั้งค่าที่เหมาะสม',{
		hangman.word.should == 'hello'		
		hangman.wrongs.should == 0
		hangman.maxGuess.should == 12
		hangman.unrevealedWord.should == ['_', '_', '_', '_', '_']
		hangman.finished.should == false		
	}
}