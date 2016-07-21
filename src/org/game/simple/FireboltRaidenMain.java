package org.game.simple;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * 
 * Copyright 2008 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * @project org.game.simple
 * @author chenpeng  
 * @email：ceponline@yahoo.com.cn 
 * @version 0.1
 */
public class FireboltRaidenMain extends Frame {

	private static final long serialVersionUID = 1L;

	public FireboltRaidenMain() {
		setTitle("Java仿雷电游戏——雷霆行动 1.0");
		setResizable(false);
		GamePanel main = new GamePanel();
		add(main, "Center");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		pack();
	}

	public static void main(String args[]) {
		FireboltRaidenMain frame = new FireboltRaidenMain();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
