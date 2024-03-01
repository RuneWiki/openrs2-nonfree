package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akw")
public class Class93_Sub33 extends Class93 {

	@OriginalMember(owner = "client!akw", name = "f", descriptor = "Ljava/lang/String;")
	String aString120;

	@OriginalMember(owner = "client!akw", name = "k", descriptor = "I")
	int anInt3226;

	@OriginalMember(owner = "client!akw", name = "w", descriptor = "(Lclient!yf;B)V", line = 33)
	static void method23648(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1])).anInt4194 * 1554294991;
	}

	@OriginalMember(owner = "client!akw", name = "<init>", descriptor = "()V", line = 68)
	Class93_Sub33() {
	}

	@OriginalMember(owner = "client!akw", name = "amq", descriptor = "(Lclient!yf;I)V", line = 12060)
	static final void method23649(@OriginalArg(0) Class681 arg0) {
		@Pc(1) String local1 = "";
		if (Class413.aClipboard1 != null) {
			@Pc(8) Transferable local8 = Class413.aClipboard1.getContents(null);
			if (local8 != null) {
				try {
					local1 = (String) local8.getTransferData(DataFlavor.stringFlavor);
					if (local1 == null) {
						local1 = "";
					}
				} catch (@Pc(21) Exception local21) {
				}
			}
		}
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local1;
	}

	@OriginalMember(owner = "client!akw", name = "ars", descriptor = "(Lclient!yf;I)V", line = 13000)
	static final void method23647(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, local12);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, local12);
		Class51.aClass93_Sub36_1.aClass166_Sub15_1.method15672();
		Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15672();
		Class262.method26173();
		Class106_Sub1.method5148();
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!akw", name = "asp", descriptor = "(Lclient!yf;I)V", line = 13120)
	static final void method23646(@OriginalArg(0) Class681 arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		Class106_Sub1.method5148();
	}
}
