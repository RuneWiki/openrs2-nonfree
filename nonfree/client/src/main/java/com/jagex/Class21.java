package com.jagex;

import java.awt.Canvas;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public abstract class Class21 {

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	protected static final int anInt2460 = 1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public static final int anInt2461 = 1;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	public static final int anInt2462 = 2;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	public static final int anInt2464 = 5;

	@OriginalMember(owner = "client!de", name = "x", descriptor = "I")
	static final int anInt2465 = 8;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	public static final int anInt2466 = 0;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public static final int anInt2467 = 0;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "I")
	public static final int anInt2468 = 1;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public static final int anInt2469 = 2;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	protected static final int anInt2470 = 2;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	protected static final int anInt2471 = 32;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "I")
	protected static final int anInt2472 = 4;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	protected static final int anInt2473 = 8;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "I")
	protected static final int anInt2474 = 16;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static final int anInt2475 = 3;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	static final int anInt2477 = 4;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "[Z")
	static boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!df;")
	protected Class19 aClass19_6;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!abq;")
	protected Class19_Sub2 aClass19_Sub2_6;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	int anInt2476 = 219278195;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/util/Hashtable;")
	protected Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[Lclient!abj;")
	final Class19_Sub1[] aClass19_Sub1Array6 = new Class19_Sub1[4];

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!ds;")
	public final Class134 aClass134_7;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "Lclient!di;")
	public final Interface11 anInterface11_6;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public final int anInt2463;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!ds;Lclient!di;Lclient!ny;IIIB)Lclient!de;", line = 54)
	static synchronized Class21 method17109(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) Class359 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 == 0) {
			return Class451.method28391(arg1, arg2, arg3, arg6, arg7);
		} else if (arg0 == 1) {
			return Class111.method22015(arg1, arg2, arg3, arg5);
		} else if (arg0 == 5) {
			return Class376.method27236(arg1, arg2, arg3, arg4, arg5);
		} else if (arg0 == 3) {
			return Class299.method25635(arg1, arg2, arg3, arg4, arg5);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!de", name = "mj", descriptor = "(ILjava/awt/Canvas;Lclient!ds;Lclient!di;Lclient!ny;III)Lclient!de;", line = 54)
	static synchronized Class21 method17162(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) Class359 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 == 0) {
			return Class451.method28391(arg1, arg2, arg3, arg6, arg7);
		} else if (arg0 == 1) {
			return Class111.method22015(arg1, arg2, arg3, arg5);
		} else if (arg0 == 5) {
			return Class376.method27236(arg1, arg2, arg3, arg4, arg5);
		} else if (arg0 == 3) {
			return Class299.method25635(arg1, arg2, arg3, arg4, arg5);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!de", name = "mu", descriptor = "(ILjava/awt/Canvas;Lclient!ds;Lclient!di;Lclient!ny;III)Lclient!de;", line = 54)
	static synchronized Class21 method17244(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) Class359 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 == 0) {
			return Class451.method28391(arg1, arg2, arg3, arg6, arg7);
		} else if (arg0 == 1) {
			return Class111.method22015(arg1, arg2, arg3, arg5);
		} else if (arg0 == 5) {
			return Class376.method27236(arg1, arg2, arg3, arg4, arg5);
		} else if (arg0 == 3) {
			return Class299.method25635(arg1, arg2, arg3, arg4, arg5);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!de", name = "mx", descriptor = "(I)Z", line = 66)
	public static boolean method17355(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!de", name = "mh", descriptor = "(I)Z", line = 66)
	public static boolean method17356(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!de", name = "my", descriptor = "(I)Z", line = 66)
	public static boolean method17357(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!de", name = "mg", descriptor = "(I)Z", line = 70)
	public static boolean method17118(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!de", name = "mq", descriptor = "(I)Z", line = 70)
	public static boolean method17359(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!de", name = "mi", descriptor = "(I)Z", line = 70)
	public static boolean method17360(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!de", name = "mp", descriptor = "(I)Z", line = 70)
	public static boolean method17361(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ds;Lclient!di;)V", line = 73)
	Class21(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Interface11 arg1) {
		this.aClass134_7 = arg0;
		this.anInterface11_6 = arg1;
		@Pc(21) int local21 = -1;
		for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
			if (!aBooleanArray14[local23]) {
				aBooleanArray14[local23] = true;
				local21 = local23;
				break;
			}
		}
		if (local21 == -1) {
			throw new IllegalStateException("");
		}
		this.anInt2463 = local21 * -236238995;
	}

	@OriginalMember(owner = "client!de", name = "h", descriptor = "(Lclient!ny;I)I", line = 74)
	public static int method17428(@OriginalArg(0) Class359 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method26674(Class568.anInt5374 * 1855541627)) {
			local1++;
		}
		if (arg0.method26674(Class568.anInt5375 * 1066549597)) {
			local1++;
		}
		if (arg0.method26674(Class568.anInt5376 * 489968913)) {
			local1++;
		}
		if (arg0.method26674(Class264.anInt4207 * 1856440075)) {
			local1++;
		}
		if (arg0.method26674(Class529.anInt5305 * -617565157)) {
			local1++;
		}
		if (arg0.method26674(Class519.anInt5284 * 1071850601)) {
			local1++;
		}
		if (arg0.method26674(Class568.anInt5379 * -808362187)) {
			local1++;
		}
		if (arg0.method26674(Class230.anInt3737 * 1195525849)) {
			local1++;
		}
		if (arg0.method26674(FileFilter_Sub1.anInt2088 * 235232017)) {
			local1++;
		}
		if (arg0.method26674(Class568.anInt5377 * -379151387)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!de", name = "x", descriptor = "(B)V", line = 89)
	public final void method17017() throws Exception_Sub2 {
		this.method17018(0, 0);
	}

	@OriginalMember(owner = "client!de", name = "mf", descriptor = "()V", line = 89)
	public final void method17362() throws Exception_Sub2 {
		this.method17018(0, 0);
	}

	@OriginalMember(owner = "client!de", name = "y", descriptor = "(B)V", line = 96)
	public void method17020() {
		aBooleanArray14[this.anInt2463 * -427632027] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class19_Sub2 local23 = (Class19_Sub2) this.aHashtable6.get(local17);
			local23.method21392();
		}
		this.method17021();
	}

	@OriginalMember(owner = "client!de", name = "ml", descriptor = "()V", line = 96)
	public void method17363() {
		aBooleanArray14[this.anInt2463 * -427632027] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class19_Sub2 local23 = (Class19_Sub2) this.aHashtable6.get(local17);
			local23.method21392();
		}
		this.method17021();
	}

	@OriginalMember(owner = "client!de", name = "mm", descriptor = "()V", line = 96)
	public void method17364() {
		aBooleanArray14[this.anInt2463 * -427632027] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class19_Sub2 local23 = (Class19_Sub2) this.aHashtable6.get(local17);
			local23.method21392();
		}
		this.method17021();
	}

	@OriginalMember(owner = "client!de", name = "mt", descriptor = "()V", line = 96)
	public void method17365() {
		aBooleanArray14[this.anInt2463 * -427632027] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class19_Sub2 local23 = (Class19_Sub2) this.aHashtable6.get(local17);
			local23.method21392();
		}
		this.method17021();
	}

	@OriginalMember(owner = "client!de", name = "v", descriptor = "(Lclient!vs;I)V", line = 100)
	static void method17427(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray20[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!de", name = "hh", descriptor = "()V", line = 111)
	void method17204() {
		this.method17020();
	}

	@OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V", line = 111)
	@Override
	void finalize() {
		this.method17020();
	}

	@OriginalMember(owner = "client!de", name = "mr", descriptor = "(Ljava/awt/Canvas;)V", line = 128)
	public static void method17052(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!de", name = "mo", descriptor = "(Ljava/awt/Canvas;)V", line = 128)
	public static void method17367(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "([I)V", line = 136)
	public void method17036(@OriginalArg(0) int[] arg0) {
		if (this.aClass19_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass19_Sub2_6.method21390();
			arg0[1] = this.aClass19_Sub2_6.method21391();
		}
	}

	@OriginalMember(owner = "client!de", name = "fi", descriptor = "([I)V", line = 136)
	public void method17103(@OriginalArg(0) int[] arg0) {
		if (this.aClass19_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass19_Sub2_6.method21390();
			arg0[1] = this.aClass19_Sub2_6.method21391();
		}
	}

	@OriginalMember(owner = "client!de", name = "fr", descriptor = "([I)V", line = 136)
	public void method17303(@OriginalArg(0) int[] arg0) {
		if (this.aClass19_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass19_Sub2_6.method21390();
			arg0[1] = this.aClass19_Sub2_6.method21391();
		}
	}

	@OriginalMember(owner = "client!de", name = "k", descriptor = "(I)Lclient!df;", line = 148)
	public final Class19 method17037() {
		return this.aClass19_6;
	}

	@OriginalMember(owner = "client!de", name = "mc", descriptor = "()Lclient!df;", line = 148)
	public final Class19 method17171() {
		return this.aClass19_6;
	}

	@OriginalMember(owner = "client!de", name = "ms", descriptor = "()Lclient!df;", line = 148)
	public final Class19 method17291() {
		return this.aClass19_6;
	}

	@OriginalMember(owner = "client!de", name = "mw", descriptor = "()Lclient!df;", line = 148)
	public final Class19 method17370() {
		return this.aClass19_6;
	}

	@OriginalMember(owner = "client!de", name = "at", descriptor = "(I)Lclient!abq;", line = 152)
	public final Class19_Sub2 method17038() {
		return this.aClass19_Sub2_6;
	}

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "()Lclient!abq;", line = 152)
	public final Class19_Sub2 method17371() {
		return this.aClass19_Sub2_6;
	}

	@OriginalMember(owner = "client!de", name = "af", descriptor = "(Ljava/awt/Canvas;IIB)V", line = 156)
	public final void method17039(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class66_Sub1.method13213(arg0);
			this.method17040(arg0, this.method17046(arg0, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!de", name = "ny", descriptor = "(Ljava/awt/Canvas;II)V", line = 156)
	public final void method17045(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class66_Sub1.method13213(arg0);
			this.method17040(arg0, this.method17046(arg0, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!de", name = "mn", descriptor = "(Ljava/awt/Canvas;II)V", line = 156)
	public final void method17136(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class66_Sub1.method13213(arg0);
			this.method17040(arg0, this.method17046(arg0, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!de", name = "md", descriptor = "(Ljava/awt/Canvas;II)V", line = 156)
	public final void method17261(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class66_Sub1.method13213(arg0);
			this.method17040(arg0, this.method17046(arg0, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!de", name = "ng", descriptor = "(Ljava/awt/Canvas;II)V", line = 156)
	public final void method17374(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class66_Sub1.method13213(arg0);
			this.method17040(arg0, this.method17046(arg0, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!de", name = "ak", descriptor = "(Ljava/awt/Canvas;Lclient!abq;I)V", line = 163)
	final void method17040(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class19_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "no", descriptor = "(Ljava/awt/Canvas;Lclient!abq;)V", line = 163)
	final void method17133(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class19_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "nh", descriptor = "(Ljava/awt/Canvas;Lclient!abq;)V", line = 163)
	final void method17325(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class19_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "aa", descriptor = "(Ljava/awt/Canvas;B)V", line = 168)
	public final void method17041(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class19_Sub2 local10 = (Class19_Sub2) this.aHashtable6.get(arg0);
			local10.method21392();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "nk", descriptor = "(Ljava/awt/Canvas;)V", line = 168)
	public final void method17391(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class19_Sub2 local10 = (Class19_Sub2) this.aHashtable6.get(arg0);
			local10.method21392();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "nj", descriptor = "(Ljava/awt/Canvas;)V", line = 168)
	public final void method17415(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class19_Sub2 local10 = (Class19_Sub2) this.aHashtable6.get(arg0);
			local10.method21392();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "ah", descriptor = "(Ljava/awt/Canvas;I)V", line = 177)
	public final void method17042(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class19_Sub2 local5 = (Class19_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2476 * 1664601669 <= 0 && this.aClass19_6 == this.aClass19_Sub2_6) {
			if (this.aClass19_6 != null) {
				this.aClass19_6.method21400();
			}
			if (this.anInt2476 * 1664601669 < 0) {
				this.aClass19_6 = local5;
			}
			this.aClass19_Sub2_6 = local5;
			local5.method21393();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!de", name = "nx", descriptor = "(Ljava/awt/Canvas;)V", line = 177)
	public final void method17278(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class19_Sub2 local5 = (Class19_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2476 * 1664601669 <= 0 && this.aClass19_6 == this.aClass19_Sub2_6) {
			if (this.aClass19_6 != null) {
				this.aClass19_6.method21400();
			}
			if (this.anInt2476 * 1664601669 < 0) {
				this.aClass19_6 = local5;
			}
			this.aClass19_Sub2_6 = local5;
			local5.method21393();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!de", name = "nc", descriptor = "(Ljava/awt/Canvas;)V", line = 177)
	public final void method17331(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class19_Sub2 local5 = (Class19_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2476 * 1664601669 <= 0 && this.aClass19_6 == this.aClass19_Sub2_6) {
			if (this.aClass19_6 != null) {
				this.aClass19_6.method21400();
			}
			if (this.anInt2476 * 1664601669 < 0) {
				this.aClass19_6 = local5;
			}
			this.aClass19_Sub2_6 = local5;
			local5.method21393();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!de", name = "nl", descriptor = "(Ljava/awt/Canvas;)V", line = 177)
	public final void method17380(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class19_Sub2 local5 = (Class19_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2476 * 1664601669 <= 0 && this.aClass19_6 == this.aClass19_Sub2_6) {
			if (this.aClass19_6 != null) {
				this.aClass19_6.method21400();
			}
			if (this.anInt2476 * 1664601669 < 0) {
				this.aClass19_6 = local5;
			}
			this.aClass19_Sub2_6 = local5;
			local5.method21393();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!de", name = "ni", descriptor = "(Ljava/awt/Canvas;)V", line = 177)
	public final void method17382(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class19_Sub2 local5 = (Class19_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2476 * 1664601669 <= 0 && this.aClass19_6 == this.aClass19_Sub2_6) {
			if (this.aClass19_6 != null) {
				this.aClass19_6.method21400();
			}
			if (this.anInt2476 * 1664601669 < 0) {
				this.aClass19_6 = local5;
			}
			this.aClass19_Sub2_6 = local5;
			local5.method21393();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!de", name = "an", descriptor = "(Ljava/awt/Canvas;IIB)V", line = 187)
	public final void method17043(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class19_Sub2 local5 = (Class19_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method21414(arg1, arg2);
	}

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "(Ljava/awt/Canvas;II)V", line = 187)
	public final void method17384(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class19_Sub2 local5 = (Class19_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method21414(arg1, arg2);
	}

	@OriginalMember(owner = "client!de", name = "aj", descriptor = "(Lclient!abj;I)V", line = 193)
	public final void method17044(@OriginalArg(0) Class19_Sub1 arg0) {
		if (this.anInt2476 * 1664601669 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2476 * 1664601669 >= 0) {
			this.aClass19_Sub1Array6[this.anInt2476 * 1664601669].method21400();
		} else {
			this.aClass19_Sub2_6.method21400();
		}
		this.aClass19_6 = this.aClass19_Sub1Array6[(this.anInt2476 += -219278195) * 1664601669] = arg0;
		arg0.method21393();
	}

	@OriginalMember(owner = "client!de", name = "ne", descriptor = "(Lclient!abj;)V", line = 193)
	public final void method17385(@OriginalArg(0) Class19_Sub1 arg0) {
		if (this.anInt2476 * 1664601669 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2476 * 1664601669 >= 0) {
			this.aClass19_Sub1Array6[this.anInt2476 * 1664601669].method21400();
		} else {
			this.aClass19_Sub2_6.method21400();
		}
		this.aClass19_6 = this.aClass19_Sub1Array6[(this.anInt2476 += -219278195) * 1664601669] = arg0;
		arg0.method21393();
	}

	@OriginalMember(owner = "client!de", name = "nw", descriptor = "(Lclient!abj;)V", line = 193)
	public final void method17386(@OriginalArg(0) Class19_Sub1 arg0) {
		if (this.anInt2476 * 1664601669 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2476 * 1664601669 >= 0) {
			this.aClass19_Sub1Array6[this.anInt2476 * 1664601669].method21400();
		} else {
			this.aClass19_Sub2_6.method21400();
		}
		this.aClass19_6 = this.aClass19_Sub1Array6[(this.anInt2476 += -219278195) * 1664601669] = arg0;
		arg0.method21393();
	}

	@OriginalMember(owner = "client!de", name = "nt", descriptor = "(Lclient!abj;)V", line = 203)
	public final void method17160(@OriginalArg(0) Class19_Sub1 arg0) {
		if (this.anInt2476 * 1664601669 < 0 || this.aClass19_Sub1Array6[this.anInt2476 * 1664601669] != arg0) {
			throw new RuntimeException();
		}
		this.aClass19_Sub1Array6[(this.anInt2476 -= -219278195) * 1664601669 + 1] = null;
		arg0.method21400();
		if (this.anInt2476 * 1664601669 >= 0) {
			this.aClass19_6 = this.aClass19_Sub1Array6[this.anInt2476 * 1664601669];
			this.aClass19_Sub1Array6[this.anInt2476 * 1664601669].method21393();
		} else {
			this.aClass19_6 = this.aClass19_Sub2_6;
			this.aClass19_Sub2_6.method21393();
		}
	}

	@OriginalMember(owner = "client!de", name = "as", descriptor = "(Lclient!abj;I)V", line = 203)
	public final void method17263(@OriginalArg(0) Class19_Sub1 arg0) {
		if (this.anInt2476 * 1664601669 < 0 || this.aClass19_Sub1Array6[this.anInt2476 * 1664601669] != arg0) {
			throw new RuntimeException();
		}
		this.aClass19_Sub1Array6[(this.anInt2476 -= -219278195) * 1664601669 + 1] = null;
		arg0.method21400();
		if (this.anInt2476 * 1664601669 >= 0) {
			this.aClass19_6 = this.aClass19_Sub1Array6[this.anInt2476 * 1664601669];
			this.aClass19_Sub1Array6[this.anInt2476 * 1664601669].method21393();
		} else {
			this.aClass19_6 = this.aClass19_Sub2_6;
			this.aClass19_Sub2_6.method21393();
		}
	}

	@OriginalMember(owner = "client!de", name = "ar", descriptor = "(Z)V", line = 229)
	public void method17059(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "oe", descriptor = "(Z)V", line = 229)
	public void method17242(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "om", descriptor = "(Z)V", line = 229)
	public void method17269(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "ok", descriptor = "(Z)V", line = 229)
	public void method17418(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "oq", descriptor = "(Z)V", line = 229)
	public void method17419(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "aw", descriptor = "(IIIIII)V", line = 234)
	public final void method17062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17068(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!de", name = "ac", descriptor = "(IIIIII)V", line = 238)
	public final void method17063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17050(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!de", name = "bw", descriptor = "(IIIIB)V", line = 242)
	public final void method17064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17420(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!de", name = "np", descriptor = "(IIII)V", line = 242)
	public final void method17387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17420(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!de", name = "nf", descriptor = "(IIII)V", line = 242)
	public final void method17388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17420(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!de", name = "bp", descriptor = "(IIIII)V", line = 246)
	public final void method17065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17072(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!de", name = "nz", descriptor = "(IIII)V", line = 246)
	public final void method17389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17072(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!de", name = "bd", descriptor = "(IIIII)V", line = 250)
	public final void method17066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17073(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!de", name = "nm", descriptor = "(IIII)V", line = 250)
	public final void method17069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17073(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!de", name = "bs", descriptor = "(IIIIII)V", line = 254)
	public final void method17067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!de", name = "ns", descriptor = "(IIIII)V", line = 254)
	public final void method17383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!de", name = "nr", descriptor = "(IIIII)V", line = 254)
	public final void method17392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!de", name = "na", descriptor = "(IIIII)V", line = 254)
	public final void method17393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!de", name = "u", descriptor = "(Lclient!zz;IILclient!pp;B)V", line = 270)
	public static void method17421(@OriginalArg(0) Class634 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface43 arg3) {
		@Pc(2) Class536 local2 = Class27.method15271();
		local2.anInterface43_1 = arg3;
		Class316.method25839(arg0, arg1, arg2, local2);
		local2.anInterface43_1 = null;
	}

	@OriginalMember(owner = "client!de", name = "bo", descriptor = "(IILclient!mu;Lclient!mk;I)Z", line = 271)
	public boolean method17080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Class323 arg3) {
		return this.method17029(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!de", name = "nv", descriptor = "(IILclient!mu;Lclient!mk;)Z", line = 271)
	public boolean method17394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Class323 arg3) {
		return this.method17029(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!de", name = "bh", descriptor = "(IIZI)Lclient!co;", line = 280)
	public Class6 method17259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.method17086(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!de", name = "nn", descriptor = "(IIZ)Lclient!co;", line = 280)
	public Class6 method17395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.method17086(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!de", name = "bv", descriptor = "([IIIIII)Lclient!co;", line = 287)
	public Class6 method17113(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method17087(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!de", name = "nd", descriptor = "([IIIII)Lclient!co;", line = 287)
	public Class6 method17396(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method17087(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!de", name = "nq", descriptor = "([IIIII)Lclient!co;", line = 287)
	public Class6 method17397(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method17087(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!de", name = "cm", descriptor = "()V", line = 292)
	public void method17028() {
	}

	@OriginalMember(owner = "client!de", name = "or", descriptor = "()V", line = 292)
	public void method17193() {
	}

	@OriginalMember(owner = "client!de", name = "nu", descriptor = "()V", line = 292)
	public void method17398() {
	}

	@OriginalMember(owner = "client!de", name = "oo", descriptor = "()V", line = 293)
	public void method17025() {
	}

	@OriginalMember(owner = "client!de", name = "cj", descriptor = "()V", line = 293)
	public void method17092() {
	}

	@OriginalMember(owner = "client!de", name = "oh", descriptor = "()V", line = 293)
	public void method17401() {
	}

	@OriginalMember(owner = "client!de", name = "cu", descriptor = "()V", line = 294)
	public void method17093() {
	}

	@OriginalMember(owner = "client!de", name = "od", descriptor = "()V", line = 294)
	public void method17402() {
	}

	@OriginalMember(owner = "client!de", name = "oa", descriptor = "()V", line = 294)
	public void method17403() {
	}

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "(I)Z", line = 307)
	public boolean method17104() {
		return true;
	}

	@OriginalMember(owner = "client!de", name = "on", descriptor = "()Z", line = 307)
	public boolean method17405() {
		return true;
	}

	@OriginalMember(owner = "client!de", name = "os", descriptor = "()Z", line = 307)
	public boolean method17417() {
		return true;
	}

	@OriginalMember(owner = "client!de", name = "iv", descriptor = "(IIIIIF)Lclient!afz;", line = 323)
	public Class3_Sub15 method17264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub15(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!de", name = "dv", descriptor = "(IIIIIF)Lclient!afz;", line = 323)
	public Class3_Sub15 method17311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub15(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!de", name = "iz", descriptor = "(IIIIIF)Lclient!afz;", line = 323)
	public Class3_Sub15 method17318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub15(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!de", name = "de", descriptor = "(FFFI)V", line = 343)
	public void method17112(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method17219(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!de", name = "ov", descriptor = "(FFF)V", line = 343)
	public void method17315(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method17219(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!de", name = "of", descriptor = "(FFF)V", line = 343)
	public void method17407(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method17219(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!de", name = "do", descriptor = "(IIII[IIII)[I", line = 354)
	public int[] method17139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = (arg1 - 1) * arg2;
				for (local25 = 0; local25 < arg2; local25++) {
					local4[local25 + arg2 * local11] = local4[local25 + local23];
				}
			} else {
				local23 = arg5 + arg6 * local11;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local25 + arg2 * local11] = arg4[local25 + local23];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[arg2 * local11 + local52] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!de", name = "op", descriptor = "(IIII[III)[I", line = 354)
	public int[] method17239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = (arg1 - 1) * arg2;
				for (local25 = 0; local25 < arg2; local25++) {
					local4[local25 + arg2 * local11] = local4[local25 + local23];
				}
			} else {
				local23 = arg5 + arg6 * local11;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local25 + arg2 * local11] = arg4[local25 + local23];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[arg2 * local11 + local52] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!de", name = "og", descriptor = "(IIII[III)[I", line = 354)
	public int[] method17410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = (arg1 - 1) * arg2;
				for (local25 = 0; local25 < arg2; local25++) {
					local4[local25 + arg2 * local11] = local4[local25 + local23];
				}
			} else {
				local23 = arg5 + arg6 * local11;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local25 + arg2 * local11] = arg4[local25 + local23];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[arg2 * local11 + local52] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!de", name = "ot", descriptor = "(IIII[III)[I", line = 354)
	public int[] method17411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = (arg1 - 1) * arg2;
				for (local25 = 0; local25 < arg2; local25++) {
					local4[local25 + arg2 * local11] = local4[local25 + local23];
				}
			} else {
				local23 = arg5 + arg6 * local11;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local25 + arg2 * local11] = arg4[local25 + local23];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[arg2 * local11 + local52] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!de", name = "oj", descriptor = "(IIII[III)[I", line = 354)
	public int[] method17413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = (arg1 - 1) * arg2;
				for (local25 = 0; local25 < arg2; local25++) {
					local4[local25 + arg2 * local11] = local4[local25 + local23];
				}
			} else {
				local23 = arg5 + arg6 * local11;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local25 + arg2 * local11] = arg4[local25 + local23];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[arg2 * local11 + local52] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!de", name = "di", descriptor = "(IIII[FIIII)[F", line = 372)
	public float[] method17140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local15 * arg2 * arg7 + local29 * arg7 + local34] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) float[] local66 = new float[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local34 + local27 + (arg0 - 1) * arg7];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + arg2 * local15 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg2 * (arg1 - 1) * arg7;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = local6[local27 + local29 * arg7 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!de", name = "oz", descriptor = "(IIII[FIII)[F", line = 372)
	public float[] method17414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local15 * arg2 * arg7 + local29 * arg7 + local34] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) float[] local66 = new float[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local34 + local27 + (arg0 - 1) * arg7];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + arg2 * local15 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg2 * (arg1 - 1) * arg7;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = local6[local27 + local29 * arg7 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!de", name = "ow", descriptor = "(IIII[BIII)[B", line = 391)
	public byte[] method17083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + local29 * arg7 + arg7 * arg2 * local15] = arg4[local34 + local27 + arg7 * local29];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[arg7 * local34 + arg2 * local15 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * (arg1 - 1) * arg2;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + local29 * arg7 + arg7 * local15 * arg2] = local6[local34 + local27 + arg7 * local29];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!de", name = "dn", descriptor = "(IIII[BIIIB)[B", line = 391)
	public byte[] method17297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + local29 * arg7 + arg7 * arg2 * local15] = arg4[local34 + local27 + arg7 * local29];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[arg7 * local34 + arg2 * local15 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * (arg1 - 1) * arg2;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + local29 * arg7 + arg7 * local15 * arg2] = local6[local34 + local27 + arg7 * local29];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "(IIII[BIII)[B", line = 391)
	public byte[] method17416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + local29 * arg7 + arg7 * arg2 * local15] = arg4[local34 + local27 + arg7 * local29];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[arg7 * local34 + arg2 * local15 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * (arg1 - 1) * arg2;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + local29 * arg7 + arg7 * local15 * arg2] = local6[local34 + local27 + arg7 * local29];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!de", name = "aq", descriptor = "(IIB)Z", line = 1050)
	public static boolean method17426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Class250.aBoolean688) {
			return false;
		}
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Class178.aClass186Array1[local7] == null || Class178.aClass186Array1[local7].aClass178Array8[local11] == null) {
			return false;
		}
		@Pc(32) Class178 local32 = Class178.aClass186Array1[local7].aClass178Array8[local11];
		@Pc(46) Class3_Sub1_Sub7 local46;
		if (arg1 == -1 && local32.anInt3492 * -107621169 == 0) {
			for (local46 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local46 != null; local46 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
				if (local46.anInt2664 * 296027207 == 58 || local46.anInt2664 * 296027207 == 1007 || local46.anInt2664 * 296027207 == 25 || local46.anInt2664 * 296027207 == 57 || local46.anInt2664 * 296027207 == 30) {
					for (@Pc(147) Class178 local147 = Class375.method27235(local46.anInt2667 * -1827938669); local147 != null; local147 = Class356.method26654(Class178.aClass186Array1[local147.anInt3570 * 954808515 >> 16], local147)) {
						if (local32.anInt3570 * 954808515 == local147.anInt3570 * 954808515) {
							return true;
						}
					}
				}
			}
		} else {
			for (local46 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local46 != null; local46 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
				if (local46.anInt2666 * -1395715137 == arg1 && local46.anInt2667 * -1827938669 == local32.anInt3570 * 954808515 && (local46.anInt2664 * 296027207 == 58 || local46.anInt2664 * 296027207 == 1007 || local46.anInt2664 * 296027207 == 25 || local46.anInt2664 * 296027207 == 57 || local46.anInt2664 * 296027207 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "mz", descriptor = "(Lclient!vs;I)V", line = 6304)
	static final void method17422(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class2.method59(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!de", name = "rj", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 7166)
	static final void method17423(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(12) int local12 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
		@Pc(27) int local27 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381] - 1;
		@Pc(29) int local29 = local27;
		if (arg0.anInt3513 * -2138884745 != 6 && arg0.anInt3513 * -2138884745 != 2) {
			throw new RuntimeException("");
		}
		@Pc(54) Class571 local54 = Class498.aClass579_1.method33185(arg0.anInt3514 * -472903775);
		if (arg0.aClass584_2 == null) {
			arg0.aClass584_2 = new Class584(local54, arg0.anInt3513 * -2138884745 == 6);
		}
		arg0.aClass584_2.aLong293 = Class468.method28748() * 3125814776544842647L;
		if (local54.aByteArray108 != null) {
			if (local27 < 0 || local27 >= local54.aByteArray108.length) {
				throw new RuntimeException("");
			}
			local29 = local54.aByteArray108[local27];
		}
		if (local54.aShortArray127 == null || local29 < 0 || local29 >= local54.aShortArray127.length) {
			throw new RuntimeException("");
		}
		arg0.aClass584_2.aShortArray131[local29] = (short) local12;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!de", name = "aja", descriptor = "(Lclient!vs;I)V", line = 10833)
	static final void method17424(@OriginalArg(0) Class536 arg0) {
		if (!Class80.aClass23_Sub1_1.method5887().method24173()) {
			throw new RuntimeException();
		}
		@Pc(14) Class30_Sub2 local14 = (Class30_Sub2) Class80.aClass23_Sub1_1.method5827();
		local14.method16453(Class383.aClass327_2, -1, 0.0F);
		client.aBoolean586 = true;
	}

	@OriginalMember(owner = "client!de", name = "alt", descriptor = "(Lclient!vs;I)V", line = 11186)
	static final void method17425(@OriginalArg(0) Class536 arg0) {
		Class394.method27445(false);
	}

	@OriginalMember(owner = "client!de", name = "ma", descriptor = "(II)Lclient!dr;")
	public abstract Interface13 method17015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "h", descriptor = "()Lclient!cr;")
	public abstract Class117 method17016();

	@OriginalMember(owner = "client!de", name = "s", descriptor = "(II)V")
	abstract void method17018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "()V")
	public abstract void method17019();

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
	abstract void method17021();

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public abstract void method17022(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "cf", descriptor = "()I")
	public abstract int method17023();

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "(IIIIII)V")
	public abstract void method17024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "ey", descriptor = "()V")
	public abstract void method17026();

	@OriginalMember(owner = "client!de", name = "jr", descriptor = "(III)V")
	public abstract void method17027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "bc", descriptor = "(IIIILclient!mu;Lclient!mk;)Z")
	abstract boolean method17029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class323 arg5);

	@OriginalMember(owner = "client!de", name = "dw", descriptor = "(FFF[F)V")
	public abstract void method17030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!de", name = "m", descriptor = "()Z")
	public abstract boolean method17031();

	@OriginalMember(owner = "client!de", name = "v", descriptor = "()Z")
	public abstract boolean method17032();

	@OriginalMember(owner = "client!de", name = "t", descriptor = "()Z")
	public abstract boolean method17033();

	@OriginalMember(owner = "client!de", name = "ke", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V")
	public abstract void method17034(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "o", descriptor = "()Ljava/lang/String;")
	public abstract String method17035();

	@OriginalMember(owner = "client!de", name = "ai", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;")
	abstract Class19_Sub2 method17046(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "aq", descriptor = "()Lclient!abj;")
	public abstract Class19_Sub1 method17047();

	@OriginalMember(owner = "client!de", name = "av", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;")
	public abstract Interface10 method17048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "ax", descriptor = "(II)Lclient!dr;")
	public abstract Interface13 method17049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "bf", descriptor = "(IIIIII)V")
	public abstract void method17050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "al", descriptor = "(IIII)[I")
	public abstract int[] method17051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "ap", descriptor = "()V")
	public abstract void method17053();

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "(IIII)V")
	public abstract void method17054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "au", descriptor = "(FF)V")
	public abstract void method17055(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!de", name = "ay", descriptor = "()V")
	public abstract void method17056();

	@OriginalMember(owner = "client!de", name = "ko", descriptor = "()Z")
	public abstract boolean method17057();

	@OriginalMember(owner = "client!de", name = "gg", descriptor = "(IIIIIILclient!ch;II)V")
	public abstract void method17058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!de", name = "ae", descriptor = "([I)V")
	public abstract void method17060(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!de", name = "ad", descriptor = "(II)V")
	public abstract void method17061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "bm", descriptor = "(IIIIII)V")
	public abstract void method17068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "bt", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method17070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!de", name = "km", descriptor = "()Z")
	public abstract boolean method17071();

	@OriginalMember(owner = "client!de", name = "bg", descriptor = "(IIIII)V")
	abstract void method17072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "br", descriptor = "(IIIII)V")
	abstract void method17073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "db", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	public abstract Class18 method17074(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3);

	@OriginalMember(owner = "client!de", name = "je", descriptor = "(Lclient!mu;)V")
	public abstract void method17075(@OriginalArg(0) Class332 arg0);

	@OriginalMember(owner = "client!de", name = "bl", descriptor = "(IIIIIIIII)V")
	public abstract void method17076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!de", name = "bi", descriptor = "(IIIIIILclient!ch;IIIII)V")
	public abstract void method17077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!de", name = "bu", descriptor = "(IIIIIII)V")
	public abstract void method17078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!de", name = "ag", descriptor = "(IIII)V")
	public abstract void method17079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "fx", descriptor = "()Z")
	public abstract boolean method17081();

	@OriginalMember(owner = "client!de", name = "bn", descriptor = "(Lclient!mu;Lclient!du;Lclient!mk;)V")
	public abstract void method17082(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class323 arg2);

	@OriginalMember(owner = "client!de", name = "bx", descriptor = "(Lclient!afu;)V")
	public abstract void method17084(@OriginalArg(0) Class3_Sub11 arg0);

	@OriginalMember(owner = "client!de", name = "gz", descriptor = "(IIII)V")
	public abstract void method17085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "bj", descriptor = "(IIZZ)Lclient!co;")
	public abstract Class6 method17086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!de", name = "bq", descriptor = "([IIIIIZ)Lclient!co;")
	public abstract Class6 method17087(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!de", name = "n", descriptor = "()Z")
	public abstract boolean method17088();

	@OriginalMember(owner = "client!de", name = "bz", descriptor = "(Lclient!dx;Z)Lclient!co;")
	public abstract Class6 method17089(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!de", name = "ck", descriptor = "(IIIIZ)Lclient!co;")
	public abstract Class6 method17090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!de", name = "fn", descriptor = "()Z")
	public abstract boolean method17091();

	@OriginalMember(owner = "client!de", name = "cv", descriptor = "(II[I[I)Lclient!ch;")
	public abstract Class5 method17094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!de", name = "cl", descriptor = "(ILclient!ch;II)V")
	public abstract void method17095(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "cq", descriptor = "(Lclient!yx;[Lclient!abc;Z)Lclient!dw;")
	public abstract Class14 method17096(@OriginalArg(0) Class611 arg0, @OriginalArg(1) Class15_Sub1[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!de", name = "lw", descriptor = "(Lclient!db;)V")
	public abstract void method17097(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!de", name = "cp", descriptor = "()Lclient!mu;")
	public abstract Class332 method17098();

	@OriginalMember(owner = "client!de", name = "jy", descriptor = "(F)V")
	public abstract void method17099(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!de", name = "cs", descriptor = "(Lclient!dy;IIII)Lclient!dh;")
	public abstract Class20 method17100(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "dx", descriptor = "(ILclient!dz;)V")
	public abstract void method17101(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "cx", descriptor = "(II)I")
	public abstract int method17102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "cz", descriptor = "(Lclient!dk;)V")
	public abstract void method17105(@OriginalArg(0) Class128 arg0);

	@OriginalMember(owner = "client!de", name = "cn", descriptor = "(Lclient!mu;)V")
	public abstract void method17106(@OriginalArg(0) Class332 arg0);

	@OriginalMember(owner = "client!de", name = "co", descriptor = "()Lclient!mu;")
	public abstract Class332 method17107();

	@OriginalMember(owner = "client!de", name = "cd", descriptor = "(Z)V")
	public abstract void method17108(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!de", name = "ci", descriptor = "()Lclient!mq;")
	public abstract Class328 method17110();

	@OriginalMember(owner = "client!de", name = "ca", descriptor = "(F)V")
	public abstract void method17111(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!de", name = "cw", descriptor = "(III)V")
	public abstract void method17114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "lj", descriptor = "(IIIIII)V")
	public abstract void method17115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "hk", descriptor = "(IIIIIILclient!ch;IIIII)V")
	public abstract void method17116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!de", name = "ct", descriptor = "(II)I")
	public abstract int method17117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "gy", descriptor = "(Z)V")
	public abstract void method17119(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!de", name = "kv", descriptor = "([I)Lclient!cf;")
	public abstract Class16 method17120(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!de", name = "dk", descriptor = "(IIII)V")
	public abstract void method17121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "hn", descriptor = "(Lclient!mu;Lclient!du;Lclient!mk;)V")
	public abstract void method17122(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class323 arg2);

	@OriginalMember(owner = "client!de", name = "dg", descriptor = "()Z")
	public abstract boolean method17123();

	@OriginalMember(owner = "client!de", name = "dy", descriptor = "()V")
	public abstract void method17124();

	@OriginalMember(owner = "client!de", name = "ds", descriptor = "(FFFFF)V")
	public abstract void method17125(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!de", name = "dr", descriptor = "([I)Lclient!cf;")
	public abstract Class16 method17126(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!de", name = "hu", descriptor = "(II[I[I)Lclient!ch;")
	public abstract Class5 method17127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!de", name = "dt", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V")
	public abstract void method17128(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "dd", descriptor = "()Z")
	public abstract boolean method17129();

	@OriginalMember(owner = "client!de", name = "da", descriptor = "()V")
	public abstract void method17130();

	@OriginalMember(owner = "client!de", name = "dz", descriptor = "()Z")
	public abstract boolean method17131();

	@OriginalMember(owner = "client!de", name = "cr", descriptor = "(IFFFFF)V")
	public abstract void method17132(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "fs", descriptor = "()Z")
	public abstract boolean method17134();

	@OriginalMember(owner = "client!de", name = "ly", descriptor = "(IIIIII)V")
	public abstract void method17135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "hr", descriptor = "(Lclient!afu;)V")
	public abstract void method17137(@OriginalArg(0) Class3_Sub11 arg0);

	@OriginalMember(owner = "client!de", name = "du", descriptor = "(FFF[F)V")
	public abstract void method17138(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!de", name = "lz", descriptor = "(I)Lclient!afu;")
	public abstract Class3_Sub11 method17141(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "ee", descriptor = "(Z)V")
	public abstract void method17142(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!de", name = "ex", descriptor = "()Lclient!cr;")
	public abstract Class117 method17143();

	@OriginalMember(owner = "client!de", name = "lr", descriptor = "(I)Lclient!afu;")
	public abstract Class3_Sub11 method17144(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "ba", descriptor = "(IIIIII)I")
	public abstract int method17145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "iq", descriptor = "(Lclient!dy;IIII)Lclient!dh;")
	public abstract Class20 method17146(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "er", descriptor = "()V")
	public abstract void method17147();

	@OriginalMember(owner = "client!de", name = "ej", descriptor = "()V")
	public abstract void method17148();

	@OriginalMember(owner = "client!de", name = "en", descriptor = "()V")
	abstract void method17149();

	@OriginalMember(owner = "client!de", name = "ew", descriptor = "()V")
	abstract void method17150();

	@OriginalMember(owner = "client!de", name = "em", descriptor = "()V")
	abstract void method17151();

	@OriginalMember(owner = "client!de", name = "ec", descriptor = "()V")
	abstract void method17152();

	@OriginalMember(owner = "client!de", name = "ea", descriptor = "()V")
	abstract void method17153();

	@OriginalMember(owner = "client!de", name = "ez", descriptor = "(I)V")
	public abstract void method17154(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "ep", descriptor = "(I)V")
	public abstract void method17155(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "ed", descriptor = "()Z")
	public abstract boolean method17156();

	@OriginalMember(owner = "client!de", name = "z", descriptor = "()I")
	public abstract int method17157();

	@OriginalMember(owner = "client!de", name = "ev", descriptor = "()Z")
	public abstract boolean method17158();

	@OriginalMember(owner = "client!de", name = "et", descriptor = "()Z")
	public abstract boolean method17159();

	@OriginalMember(owner = "client!de", name = "ek", descriptor = "()Z")
	public abstract boolean method17161();

	@OriginalMember(owner = "client!de", name = "el", descriptor = "()Z")
	public abstract boolean method17163();

	@OriginalMember(owner = "client!de", name = "q", descriptor = "()Z")
	public abstract boolean method17164();

	@OriginalMember(owner = "client!de", name = "eg", descriptor = "()Z")
	public abstract boolean method17165();

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()Z")
	public abstract boolean method17166();

	@OriginalMember(owner = "client!de", name = "eh", descriptor = "()Z")
	public abstract boolean method17167();

	@OriginalMember(owner = "client!de", name = "ft", descriptor = "()Z")
	public abstract boolean method17168();

	@OriginalMember(owner = "client!de", name = "ih", descriptor = "()Lclient!mq;")
	public abstract Class328 method17169();

	@OriginalMember(owner = "client!de", name = "jp", descriptor = "(Lclient!mq;)V")
	public abstract void method17170(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!de", name = "ln", descriptor = "(Lclient!db;)V")
	public abstract void method17172(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!de", name = "im", descriptor = "(II)I")
	public abstract int method17173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "fh", descriptor = "()Z")
	public abstract boolean method17174();

	@OriginalMember(owner = "client!de", name = "fu", descriptor = "()Z")
	public abstract boolean method17175();

	@OriginalMember(owner = "client!de", name = "fg", descriptor = "()Z")
	public abstract boolean method17176();

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "()Z")
	public abstract boolean method17177();

	@OriginalMember(owner = "client!de", name = "dj", descriptor = "(ILclient!dz;)V")
	public abstract void method17178(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "fz", descriptor = "()Ljava/lang/String;")
	public abstract String method17179();

	@OriginalMember(owner = "client!de", name = "fv", descriptor = "()Ljava/lang/String;")
	public abstract String method17180();

	@OriginalMember(owner = "client!de", name = "fy", descriptor = "()Ljava/lang/String;")
	public abstract String method17181();

	@OriginalMember(owner = "client!de", name = "fe", descriptor = "(Z)V")
	public abstract void method17182();

	@OriginalMember(owner = "client!de", name = "fw", descriptor = "(Z)V")
	public abstract void method17183();

	@OriginalMember(owner = "client!de", name = "fo", descriptor = "(Z)V")
	public abstract void method17184();

	@OriginalMember(owner = "client!de", name = "it", descriptor = "()Lclient!mu;")
	public abstract Class332 method17185();

	@OriginalMember(owner = "client!de", name = "ff", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;")
	abstract Class19_Sub2 method17186(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "fk", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;")
	abstract Class19_Sub2 method17187(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "fj", descriptor = "(IIII)[I")
	public abstract int[] method17188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "fa", descriptor = "()V")
	public abstract void method17189();

	@OriginalMember(owner = "client!de", name = "es", descriptor = "()Z")
	public abstract boolean method17190();

	@OriginalMember(owner = "client!de", name = "kj", descriptor = "(ILclient!dz;)V")
	public abstract void method17191(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "jg", descriptor = "(F)V")
	public abstract void method17192(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!de", name = "gf", descriptor = "(Z)V")
	public abstract void method17194(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!de", name = "lf", descriptor = "(IIIIZ)Lclient!co;")
	public abstract Class6 method17195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!de", name = "gp", descriptor = "()V")
	public abstract void method17196();

	@OriginalMember(owner = "client!de", name = "ge", descriptor = "()V")
	public abstract void method17197();

	@OriginalMember(owner = "client!de", name = "lh", descriptor = "(IIIIII)V")
	public abstract void method17198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "gd", descriptor = "(IIII)V")
	public abstract void method17199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "gm", descriptor = "(FF)V")
	public abstract void method17200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!de", name = "gn", descriptor = "()V")
	public abstract void method17201();

	@OriginalMember(owner = "client!de", name = "gv", descriptor = "()V")
	public abstract void method17202();

	@OriginalMember(owner = "client!de", name = "gh", descriptor = "(IIII)V")
	public abstract void method17203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "ji", descriptor = "(IIII)V")
	public abstract void method17205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "gt", descriptor = "([I)V")
	public abstract void method17206(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!de", name = "ga", descriptor = "([I)V")
	public abstract void method17207(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!de", name = "gr", descriptor = "([I)V")
	public abstract void method17208(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!de", name = "am", descriptor = "(IIII)V")
	public abstract void method17209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "gk", descriptor = "(IIIIII)V")
	public abstract void method17210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "gs", descriptor = "(IIIIII)V")
	public abstract void method17211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "kk", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V")
	public abstract void method17212(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "gw", descriptor = "(IIIII)V")
	abstract void method17213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "go", descriptor = "(IIIII)V")
	abstract void method17214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "gi", descriptor = "(IIIII)V")
	abstract void method17215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "(IIIIII)V")
	public abstract void method17216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "dq", descriptor = "()Z")
	public abstract boolean method17217();

	@OriginalMember(owner = "client!de", name = "e", descriptor = "()Z")
	public abstract boolean method17218();

	@OriginalMember(owner = "client!de", name = "dl", descriptor = "(FFFFFF)V")
	abstract void method17219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "hi", descriptor = "(IIIIIILclient!ch;IIIII)V")
	public abstract void method17220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!de", name = "fp", descriptor = "()Z")
	public abstract boolean method17221();

	@OriginalMember(owner = "client!de", name = "ha", descriptor = "(IIIIIILclient!ch;IIIII)V")
	public abstract void method17222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!de", name = "hg", descriptor = "(IIIIIILclient!ch;IIIII)V")
	public abstract void method17223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!de", name = "hc", descriptor = "(IIIIIII)V")
	public abstract void method17224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!de", name = "hd", descriptor = "(IIIIIII)V")
	public abstract void method17225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!de", name = "ho", descriptor = "(IIIIIII)V")
	public abstract void method17226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "(IIIIII)I")
	public abstract int method17227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "hz", descriptor = "(IIIIII)I")
	public abstract int method17228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "hx", descriptor = "(IIIIII)I")
	public abstract int method17229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "hs", descriptor = "(IIIILclient!mu;Lclient!mk;)Z")
	abstract boolean method17230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class323 arg5);

	@OriginalMember(owner = "client!de", name = "j", descriptor = "()Z")
	public abstract boolean method17231();

	@OriginalMember(owner = "client!de", name = "hw", descriptor = "(Lclient!afu;)V")
	public abstract void method17232(@OriginalArg(0) Class3_Sub11 arg0);

	@OriginalMember(owner = "client!de", name = "hy", descriptor = "(Lclient!afu;)V")
	public abstract void method17233(@OriginalArg(0) Class3_Sub11 arg0);

	@OriginalMember(owner = "client!de", name = "jl", descriptor = "(III)V")
	public abstract void method17234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "hf", descriptor = "(IIZZ)Lclient!co;")
	public abstract Class6 method17235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!de", name = "oi", descriptor = "(FFF[F)V")
	public abstract void method17236(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!de", name = "hq", descriptor = "(IIZZ)Lclient!co;")
	public abstract Class6 method17237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!de", name = "iy", descriptor = "()Lclient!mu;")
	public abstract Class332 method17238();

	@OriginalMember(owner = "client!de", name = "he", descriptor = "([IIIIIZ)Lclient!co;")
	public abstract Class6 method17240(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!de", name = "fl", descriptor = "(Z)V")
	public abstract void method17241();

	@OriginalMember(owner = "client!de", name = "hl", descriptor = "(ILclient!ch;II)V")
	public abstract void method17243(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "id", descriptor = "(ILclient!ch;II)V")
	public abstract void method17245(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "il", descriptor = "(Lclient!yx;[Lclient!abc;Z)Lclient!dw;")
	public abstract Class14 method17246(@OriginalArg(0) Class611 arg0, @OriginalArg(1) Class15_Sub1[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!de", name = "iu", descriptor = "(I)V")
	public abstract void method17247(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "dh", descriptor = "(I)Lclient!db;")
	public abstract Class18 method17248(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "kw", descriptor = "()Z")
	public abstract boolean method17249();

	@OriginalMember(owner = "client!de", name = "ir", descriptor = "(II)I")
	public abstract int method17250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "ig", descriptor = "(II)I")
	public abstract int method17251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "fd", descriptor = "()Z")
	public abstract boolean method17252();

	@OriginalMember(owner = "client!de", name = "ix", descriptor = "(II[[I[[IIII)Lclient!ci;")
	public abstract Class17 method17253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!de", name = "in", descriptor = "()Lclient!mq;")
	public abstract Class328 method17254();

	@OriginalMember(owner = "client!de", name = "ia", descriptor = "()Lclient!mq;")
	public abstract Class328 method17255();

	@OriginalMember(owner = "client!de", name = "w", descriptor = "()Z")
	public abstract boolean method17256();

	@OriginalMember(owner = "client!de", name = "ld", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;")
	public abstract Interface10 method17257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "ij", descriptor = "()Lclient!mu;")
	public abstract Class332 method17258();

	@OriginalMember(owner = "client!de", name = "is", descriptor = "()Lclient!mu;")
	public abstract Class332 method17260();

	@OriginalMember(owner = "client!de", name = "ei", descriptor = "()Z")
	public abstract boolean method17262();

	@OriginalMember(owner = "client!de", name = "eb", descriptor = "(II)V")
	abstract void method17265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2;

	@OriginalMember(owner = "client!de", name = "io", descriptor = "(Lclient!dk;)V")
	public abstract void method17266(@OriginalArg(0) Class128 arg0);

	@OriginalMember(owner = "client!de", name = "ie", descriptor = "(Lclient!mu;)V")
	public abstract void method17267(@OriginalArg(0) Class332 arg0);

	@OriginalMember(owner = "client!de", name = "ic", descriptor = "(Lclient!mu;)V")
	public abstract void method17268(@OriginalArg(0) Class332 arg0);

	@OriginalMember(owner = "client!de", name = "gx", descriptor = "(II)V")
	public abstract void method17270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "jc", descriptor = "()Lclient!mu;")
	public abstract Class332 method17271();

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "(Lclient!mq;)V")
	public abstract void method17272(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!de", name = "cy", descriptor = "(II[[I[[IIII)Lclient!ci;")
	public abstract Class17 method17273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!de", name = "jo", descriptor = "(Lclient!mq;)V")
	public abstract void method17274(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!de", name = "jq", descriptor = "()Lclient!mq;")
	public abstract Class328 method17275();

	@OriginalMember(owner = "client!de", name = "lv", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;")
	public abstract Interface10 method17276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "jm", descriptor = "(F)V")
	public abstract void method17277(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!de", name = "jz", descriptor = "(F)V")
	public abstract void method17279(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!de", name = "ht", descriptor = "([IIIIIZ)Lclient!co;")
	public abstract Class6 method17280(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!de", name = "kg", descriptor = "()Z")
	public abstract boolean method17281();

	@OriginalMember(owner = "client!de", name = "ja", descriptor = "(I)V")
	public abstract void method17282(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "by", descriptor = "(IIIIIILclient!ch;II)V")
	public abstract void method17283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!de", name = "lk", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;")
	public abstract Interface10 method17284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "jj", descriptor = "(I)Lclient!db;")
	public abstract Class18 method17285(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "jt", descriptor = "(I)Lclient!db;")
	public abstract Class18 method17286(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "jw", descriptor = "(I)Lclient!db;")
	public abstract Class18 method17287(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "jk", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	public abstract Class18 method17288(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3);

	@OriginalMember(owner = "client!de", name = "jv", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	public abstract Class18 method17289(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3);

	@OriginalMember(owner = "client!de", name = "gc", descriptor = "(IIIII)V")
	abstract void method17290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "ju", descriptor = "(IIII)V")
	public abstract void method17292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "jh", descriptor = "(IIII)V")
	public abstract void method17293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "jf", descriptor = "()V")
	public abstract void method17294();

	@OriginalMember(owner = "client!de", name = "kf", descriptor = "()V")
	public abstract void method17295();

	@OriginalMember(owner = "client!de", name = "kx", descriptor = "()Z")
	public abstract boolean method17296();

	@OriginalMember(owner = "client!de", name = "kl", descriptor = "()Z")
	public abstract boolean method17298();

	@OriginalMember(owner = "client!de", name = "kr", descriptor = "(FFFFF)V")
	public abstract void method17299(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!de", name = "kn", descriptor = "([I)Lclient!cf;")
	public abstract Class16 method17300(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!de", name = "fc", descriptor = "()V")
	public abstract void method17301();

	@OriginalMember(owner = "client!de", name = "ao", descriptor = "()V")
	public abstract void method17302();

	@OriginalMember(owner = "client!de", name = "gl", descriptor = "(IIIIIIIII)V")
	public abstract void method17304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!de", name = "kh", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V")
	public abstract void method17305(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "le", descriptor = "(III)Lclient!dr;")
	public abstract Interface13 method17306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "kz", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V")
	public abstract void method17307(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "ki", descriptor = "()Z")
	public abstract boolean method17308();

	@OriginalMember(owner = "client!de", name = "kt", descriptor = "()V")
	public abstract void method17309();

	@OriginalMember(owner = "client!de", name = "df", descriptor = "(I[Lclient!afz;)V")
	public abstract void method17310(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1);

	@OriginalMember(owner = "client!de", name = "ls", descriptor = "(FFF[F)V")
	public abstract void method17312(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!de", name = "eo", descriptor = "()Z")
	public abstract boolean method17313();

	@OriginalMember(owner = "client!de", name = "kd", descriptor = "(ILclient!dz;)V")
	public abstract void method17314(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "ky", descriptor = "(ILclient!dz;)V")
	public abstract void method17316(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "kq", descriptor = "(ILclient!dz;)V")
	public abstract void method17317(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "jd", descriptor = "(IFFFFF)V")
	public abstract void method17319(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "kp", descriptor = "()V")
	public abstract void method17320();

	@OriginalMember(owner = "client!de", name = "lu", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method17321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!de", name = "ch", descriptor = "(Lclient!mq;)V")
	public abstract void method17322(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!de", name = "lx", descriptor = "(FFF[F)V")
	public abstract void method17323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!de", name = "la", descriptor = "()Lclient!abj;")
	public abstract Class19_Sub1 method17324();

	@OriginalMember(owner = "client!de", name = "ll", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;")
	public abstract Interface10 method17326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "ik", descriptor = "(ILclient!ch;II)V")
	public abstract void method17327(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "lm", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;")
	public abstract Interface10 method17328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "az", descriptor = "(III)Lclient!dr;")
	public abstract Interface13 method17329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "lc", descriptor = "(III)Lclient!dr;")
	public abstract Interface13 method17330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "gq", descriptor = "([I)V")
	public abstract void method17332(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!de", name = "cg", descriptor = "()Lclient!mq;")
	public abstract Class328 method17333();

	@OriginalMember(owner = "client!de", name = "lp", descriptor = "(IIIIII)V")
	public abstract void method17334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "hp", descriptor = "(IIZZ)Lclient!co;")
	public abstract Class6 method17335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!de", name = "ka", descriptor = "()V")
	public abstract void method17336();

	@OriginalMember(owner = "client!de", name = "gu", descriptor = "(IIIIIILclient!ch;II)V")
	public abstract void method17337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!de", name = "ip", descriptor = "(II)I")
	public abstract int method17338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "fm", descriptor = "()Z")
	public abstract boolean method17339();

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "(IIIIZ)Lclient!co;")
	public abstract Class6 method17340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!de", name = "jn", descriptor = "()Lclient!mu;")
	public abstract Class332 method17341();

	@OriginalMember(owner = "client!de", name = "lg", descriptor = "(I[Lclient!afz;)V")
	public abstract void method17342(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1);

	@OriginalMember(owner = "client!de", name = "cc", descriptor = "(I)V")
	public abstract void method17343(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "ku", descriptor = "(FFFFFF)V")
	abstract void method17344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!de", name = "lt", descriptor = "(Lclient!db;)V")
	public abstract void method17345(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!de", name = "lo", descriptor = "(Lclient!db;)V")
	public abstract void method17346(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!de", name = "lq", descriptor = "(Lclient!db;)V")
	public abstract void method17347(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!de", name = "be", descriptor = "(I)Lclient!afu;")
	public abstract Class3_Sub11 method17348(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "mv", descriptor = "(II)Lclient!dr;")
	public abstract Interface13 method17349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!de", name = "mk", descriptor = "()I")
	public abstract int method17350();

	@OriginalMember(owner = "client!de", name = "me", descriptor = "()I")
	public abstract int method17351();

	@OriginalMember(owner = "client!de", name = "mz", descriptor = "()I")
	public abstract int method17352();

	@OriginalMember(owner = "client!de", name = "eq", descriptor = "()Z")
	public abstract boolean method17353();

	@OriginalMember(owner = "client!de", name = "ks", descriptor = "(ILclient!dz;)V")
	public abstract void method17354(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "kc", descriptor = "(ILclient!dz;)V")
	public abstract void method17358(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "dc", descriptor = "()Z")
	public abstract boolean method17366();

	@OriginalMember(owner = "client!de", name = "dm", descriptor = "()V")
	public abstract void method17368();

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "(ILclient!dz;)V")
	public abstract void method17369(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1);

	@OriginalMember(owner = "client!de", name = "ef", descriptor = "()V")
	public abstract void method17372();

	@OriginalMember(owner = "client!de", name = "hj", descriptor = "(Lclient!dx;Z)Lclient!co;")
	public abstract Class6 method17373(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!de", name = "iw", descriptor = "()I")
	public abstract int method17375();

	@OriginalMember(owner = "client!de", name = "eu", descriptor = "()Z")
	public abstract boolean method17376();

	@OriginalMember(owner = "client!de", name = "fq", descriptor = "()V")
	public abstract void method17377();

	@OriginalMember(owner = "client!de", name = "ii", descriptor = "()I")
	public abstract int method17378();

	@OriginalMember(owner = "client!de", name = "js", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	public abstract Class18 method17379(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3);

	@OriginalMember(owner = "client!de", name = "if", descriptor = "()Lclient!mq;")
	public abstract Class328 method17381();

	@OriginalMember(owner = "client!de", name = "gj", descriptor = "()V")
	public abstract void method17390();

	@OriginalMember(owner = "client!de", name = "li", descriptor = "(IIIIZ)Lclient!co;")
	public abstract Class6 method17399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!de", name = "dp", descriptor = "(Lclient!db;)V")
	public abstract void method17400(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!de", name = "hv", descriptor = "(IIZZ)Lclient!co;")
	public abstract Class6 method17404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!de", name = "jx", descriptor = "(I)V")
	public abstract void method17406(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "oc", descriptor = "(FFF[F)V")
	public abstract void method17408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!de", name = "r", descriptor = "()Z")
	public abstract boolean method17409();

	@OriginalMember(owner = "client!de", name = "ce", descriptor = "(I)V")
	public abstract void method17412(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "bk", descriptor = "(IIIII)V")
	abstract void method17420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
