package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public class Class340 implements Runnable {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Ljava/lang/Thread;")
	Thread aThread6;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Z")
	volatile boolean aBoolean718;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "[Lclient!ja;")
	Class338[] aClass338Array1;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "(Lclient!akv;B)Lclient!en;", line = 14)
	static Class96 method27735(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(7) Class65 local7 = Class254.method26201(local3);
		@Pc(9) Class96 local9 = null;
		switch(local7.anInt194 * -1763082495) {
			case 1:
				local9 = new Class96_Sub20(arg0);
				break;
			case 2:
				local9 = new Class96_Sub11_Sub2(arg0);
				break;
			case 3:
				local9 = new Class96_Sub23(arg0, 0, 1);
				break;
			case 4:
				local9 = new Class96_Sub23(arg0, 1, 1);
				break;
			case 5:
				local9 = new Class96_Sub23(arg0, 0, 0);
				break;
			case 6:
				local9 = new Class96_Sub9(arg0);
				break;
			case 7:
				local9 = new Class96_Sub2(arg0);
				break;
			case 8:
				local9 = new Class96_Sub16(arg0);
				break;
			case 9:
				local9 = new Class96_Sub4(arg0);
				break;
			case 10:
				local9 = new Class96_Sub8(arg0);
				break;
			case 11:
				local9 = new Class96_Sub13(arg0, true);
				break;
			case 12:
				local9 = new Class96_Sub10(arg0);
				break;
			case 13:
				local9 = new Class96_Sub11_Sub1(arg0);
				break;
			case 14:
				local9 = new Class96_Sub12(arg0);
				break;
			case 15:
				local9 = new Class96_Sub6(arg0);
				break;
			case 16:
				local9 = new Class96_Sub23(arg0, 1, 0);
				break;
			case 17:
				local9 = new Class96_Sub19(arg0);
				break;
			case 18:
				local9 = new Class96_Sub18(arg0);
			case 19:
			case 25:
			default:
				break;
			case 20:
				local9 = new Class96_Sub14(arg0);
				break;
			case 21:
				local9 = new Class96_Sub15(arg0);
				break;
			case 22:
				local9 = new Class96_Sub1(arg0);
				break;
			case 23:
				local9 = new Class96_Sub21(arg0);
				break;
			case 24:
				local9 = new Class96_Sub7(arg0);
				break;
			case 26:
				local9 = new Class96_Sub3(arg0);
				break;
			case 27:
				local9 = new Class96_Sub5(arg0);
				break;
			case 28:
				local9 = new Class96_Sub22(arg0);
				break;
			case 29:
				local9 = new Class96_Sub13(arg0, false);
				break;
			case 30:
				local9 = new Class96_Sub17(arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 19)
	Class340() {
	}

	@OriginalMember(owner = "client!je", name = "w", descriptor = "(I)Lclient!ja;", line = 22)
	Class338 method27736(@OriginalArg(0) int arg0) {
		return this.aClass338Array1 == null || arg0 < 0 || arg0 >= this.aClass338Array1.length ? null : this.aClass338Array1[arg0];
	}

	@OriginalMember(owner = "client!je", name = "y", descriptor = "(I)Lclient!ja;", line = 22)
	Class338 method27737(@OriginalArg(0) int arg0) {
		return this.aClass338Array1 == null || arg0 < 0 || arg0 >= this.aClass338Array1.length ? null : this.aClass338Array1[arg0];
	}

	@OriginalMember(owner = "client!je", name = "p", descriptor = "(II)Lclient!ja;", line = 22)
	Class338 method27738(@OriginalArg(0) int arg0) {
		return this.aClass338Array1 == null || arg0 < 0 || arg0 >= this.aClass338Array1.length ? null : this.aClass338Array1[arg0];
	}

	@OriginalMember(owner = "client!je", name = "v", descriptor = "(I)Lclient!ja;", line = 22)
	Class338 method27739(@OriginalArg(0) int arg0) {
		return this.aClass338Array1 == null || arg0 < 0 || arg0 >= this.aClass338Array1.length ? null : this.aClass338Array1[arg0];
	}

	@OriginalMember(owner = "client!je", name = "l", descriptor = "(I)Lclient!ja;", line = 22)
	Class338 method27740(@OriginalArg(0) int arg0) {
		return this.aClass338Array1 == null || arg0 < 0 || arg0 >= this.aClass338Array1.length ? null : this.aClass338Array1[arg0];
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)Z", line = 27)
	boolean method27741() {
		if (this.aBoolean718) {
			return true;
		}
		if (this.aThread6 == null) {
			this.aThread6 = new Thread(this);
			this.aThread6.start();
		}
		return this.aBoolean718;
	}

	@OriginalMember(owner = "client!je", name = "q", descriptor = "()Z", line = 27)
	boolean method27742() {
		if (this.aBoolean718) {
			return true;
		}
		if (this.aThread6 == null) {
			this.aThread6 = new Thread(this);
			this.aThread6.start();
		}
		return this.aBoolean718;
	}

	@OriginalMember(owner = "client!je", name = "t", descriptor = "()Z", line = 27)
	boolean method27743() {
		if (this.aBoolean718) {
			return true;
		}
		if (this.aThread6 == null) {
			this.aThread6 = new Thread(this);
			this.aThread6.start();
		}
		return this.aBoolean718;
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		try {
			@Pc(8) int local8 = Class581.method31694(client.aClass661_1, Class664.aClass664_1, Class98.aClass25_7.anInt122 * -1664252895);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class98.aClass25_7.aString5 + ":" + local8 + "/news.ws?game=" + client.aClass670_4.anInt5791 * -1082924039)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass338Array1 = new Class338[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass338Array1[local83 / 3] = new Class338(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!je", name = "r", descriptor = "()V", line = 37)
	public void method27744() {
		try {
			@Pc(8) int local8 = Class581.method31694(client.aClass661_1, Class664.aClass664_1, Class98.aClass25_7.anInt122 * -1664252895);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class98.aClass25_7.aString5 + ":" + local8 + "/news.ws?game=" + client.aClass670_4.anInt5791 * -1082924039)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass338Array1 = new Class338[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass338Array1[local83 / 3] = new Class338(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "()V", line = 37)
	public void method27745() {
		try {
			@Pc(8) int local8 = Class581.method31694(client.aClass661_1, Class664.aClass664_1, Class98.aClass25_7.anInt122 * -1664252895);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class98.aClass25_7.aString5 + ":" + local8 + "/news.ws?game=" + client.aClass670_4.anInt5791 * -1082924039)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass338Array1 = new Class338[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass338Array1[local83 / 3] = new Class338(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!je", name = "y", descriptor = "(II)S", line = 147)
	public static short method27746(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : local11 * (127 - local15) >> 7;
		@Pc(36) int local36 = local32 + local15;
		@Pc(45) int local45;
		if (local36 == 0) {
			local45 = local32 << 1;
		} else {
			local45 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local45 >> 4 << 7 | local36);
	}
}
