package app;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/p")
public final class Class16 {

	@OriginalMember(owner = "jagexappletviewer!app/p", name = "a", descriptor = "Ljava/awt/Button;")
	private static Button aButton1;

	@OriginalMember(owner = "jagexappletviewer!app/p", name = "b", descriptor = "Ljava/awt/Dialog;")
	static Dialog aDialog5;

	@OriginalMember(owner = "jagexappletviewer!app/p", name = "c", descriptor = "Ljava/awt/Button;")
	private static Button aButton2;

	@OriginalMember(owner = "jagexappletviewer!app/p", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	private static final void method38(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4) {
		aDialog5 = new Dialog(appletviewer.aFrame1, arg3, true);
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = -1;
		do {
			local10++;
			local12 = arg0.indexOf(10, local12 + 1);
		} while (local12 >= 0);
		@Pc(25) String[] local25 = new String[local10];
		@Pc(29) Panel local29 = new Panel();
		local29.setLayout(new GridLayout(local10, 1));
		local10 = 0;
		local12 = -1;
		@Pc(44) int local44;
		do {
			local44 = local12 + 1;
			local12 = arg0.indexOf(10, local12 + 1);
			if (local12 >= 0) {
				local25[local10++] = arg0.substring(local44, local12);
			} else {
				local25[local10++] = arg0.substring(local44);
			}
		} while (local12 >= 0);
		for (local44 = 0; local44 < local25.length; local44++) {
			@Pc(89) Label local89 = new Label(local25[local44], 1);
			local29.add(local89);
		}
		aDialog5.add(local29, "Center");
		aButton2 = new Button(arg1);
		@Pc(109) Panel_Sub1 local109 = new Panel_Sub1();
		local109.setLayout(new FlowLayout(1));
		local109.add(aButton2);
		if (arg2 <= 6) {
			return;
		}
		if (arg4 != null) {
			aButton1 = new Button(arg4);
			local109.add(aButton1);
		}
		aDialog5.add(local109, "South");
		aDialog5.setResizable(false);
		aDialog5.setSize(750, 100);
		aDialog5.setLocationRelativeTo(appletviewer.aFrame1);
	}

	@OriginalMember(owner = "jagexappletviewer!app/p", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
	static final void method39(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		aButton1 = null;
		method38(arg0, appletviewer.method11(82, "ok"), 51, appletviewer.method11(94, "message"), arg2);
		aButton2.addActionListener(new Class4());
		if (aButton1 != null) {
			aButton1.addActionListener(new Class3(arg1));
		}
		@Pc(33) int local33 = -54 % ((arg3 - 68) / 56);
		aDialog5.setVisible(true);
	}

	@OriginalMember(owner = "jagexappletviewer!app/p", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static final void method40(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aButton1 = null;
		method38(arg0, appletviewer.method11(87, "ok"), 18, appletviewer.method11(95, "message"), null);
		aButton2.addActionListener(new Class5());
		aDialog5.setVisible(true);
		if (arg1 >= -106) {
			aButton1 = null;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/p", name = "a", descriptor = "(Ljava/lang/String;B)V")
	static final void method41(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		Component_Sub2.method44(20);
		method38(arg0, appletviewer.method11(83, "quit"), 59, appletviewer.method11(116, "error"), null);
		aDialog5.addWindowListener(WindowAdapter_Sub2.method27((byte) -42));
		aButton2.addActionListener(WindowAdapter_Sub2.method27((byte) -42));
		aDialog5.setVisible(true);
		if (arg1 >= -37) {
			method39(null, null, null, (byte) -20);
		}
	}
}
