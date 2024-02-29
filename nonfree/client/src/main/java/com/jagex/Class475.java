package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class475 implements Comparable {

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "J")
	long aLong278;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "J")
	long aLong279;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Ljava/lang/Object;")
	Object anObject20;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Ljava/lang/Object;")
	Object anObject21;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 9)
	Class475(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		this.anObject20 = arg0;
		this.anObject21 = arg1;
	}

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "(Lclient!pt;I)I", line = 15)
	int method29681(@OriginalArg(0) Class475 arg0) {
		if (this.aLong279 * 2191531479349145851L < arg0.aLong279 * 2191531479349145851L) {
			return -1;
		} else if (this.aLong279 * 2191531479349145851L > arg0.aLong279 * 2191531479349145851L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(Lclient!pt;)I", line = 15)
	int method29682(@OriginalArg(0) Class475 arg0) {
		if (this.aLong279 * 2191531479349145851L < arg0.aLong279 * 2191531479349145851L) {
			return -1;
		} else if (this.aLong279 * 2191531479349145851L > arg0.aLong279 * 2191531479349145851L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pt", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class475)) {
			throw new IllegalArgumentException();
		}
		return this.anObject21.equals(((Class475) arg0).anObject21);
	}

	@OriginalMember(owner = "client!pt", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method29683(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class475)) {
			throw new IllegalArgumentException();
		}
		return this.anObject21.equals(((Class475) arg0).anObject21);
	}

	@OriginalMember(owner = "client!pt", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method29684(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class475)) {
			throw new IllegalArgumentException();
		}
		return this.anObject21.equals(((Class475) arg0).anObject21);
	}

	@OriginalMember(owner = "client!pt", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method29685(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class475)) {
			throw new IllegalArgumentException();
		}
		return this.anObject21.equals(((Class475) arg0).anObject21);
	}

	@OriginalMember(owner = "client!pt", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method29686(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class475)) {
			throw new IllegalArgumentException();
		}
		return this.anObject21.equals(((Class475) arg0).anObject21);
	}

	@OriginalMember(owner = "client!pt", name = "rr", descriptor = "()I", line = 26)
	public int method29687() {
		return this.anObject21.hashCode();
	}

	@OriginalMember(owner = "client!pt", name = "hashCode", descriptor = "()I", line = 26)
	@Override
	public int hashCode() {
		return this.anObject21.hashCode();
	}

	@OriginalMember(owner = "client!pt", name = "compareTo", descriptor = "(Ljava/lang/Object;)I", line = 30)
	@Override
	public int compareTo(@OriginalArg(0) Object arg0) {
		return this.method29681((Class475) arg0);
	}

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "(B)V", line = 38)
	public static void method29688() {
		@Pc(2) Stack local2 = Class551.aStack1;
		synchronized (Class551.aStack1) {
			Class551.aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 85)
	static String method29689(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString116 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(30) PrintWriter local30 = new PrintWriter(local25);
		arg0.printStackTrace(local30);
		local30.close();
		@Pc(38) String local38 = local25.toString();
		@Pc(46) BufferedReader local46 = new BufferedReader(new StringReader(local38));
		@Pc(49) String local49 = local46.readLine();
		while (true) {
			@Pc(52) String local52 = local46.readLine();
			if (local52 == null) {
				return local15 + "| " + local49;
			}
			@Pc(60) int local60 = local52.indexOf(40);
			@Pc(67) int local67 = local52.indexOf(41, local60 + 1);
			@Pc(75) String local75;
			if (local60 == -1) {
				local75 = local52;
			} else {
				local75 = local52.substring(0, local60);
			}
			local75 = local75.trim();
			local75 = local75.substring(local75.lastIndexOf(32) + 1);
			local75 = local75.substring(local75.lastIndexOf(9) + 1);
			local15 = local15 + local75;
			if (local60 != -1 && local67 != -1) {
				@Pc(117) int local117 = local52.indexOf(".java:", local60);
				if (local117 >= 0) {
					local15 = local15 + local52.substring(local117 + 5, local67);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "(B)I", line = 645)
	public static final int method29690() {
		return (int) (1000000000L / (Class504.aLong235 * 435371756202260911L));
	}

	@OriginalMember(owner = "client!pt", name = "js", descriptor = "(Lclient!agh;Lclient!agh;IIIIIIII)V", line = 6174)
	static final void method29691(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) Class104_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg1.method21156();
		if (local3 == -1) {
			return;
		}
		@Pc(9) Class83 local9 = null;
		local9 = (Class83) client.aClass232_63.method25835((long) local3);
		if (local9 == null) {
			@Pc(23) Class89[] local23 = Class210.method25596(Class470.aClass478_125, local3, 0);
			if (local23 == null) {
				return;
			}
			local9 = Class284.aClass86_9.method20076(local23[0], true);
			client.aClass232_63.method25844(local9, (long) local3);
		}
		@Pc(43) Class447 local43 = arg0.method24085().aClass447_61;
		Class196.method25466(arg0.aByte100, (int) local43.aFloat277, (int) local43.aFloat278, arg0.method21095() * 256, 0, false, false);
		@Pc(71) int local71 = (int) (client.aFloatArray96[0] + (float) arg3 - 18.0F);
		@Pc(83) int local83 = (int) (client.aFloatArray96[1] + (float) arg4 - 16.0F - 54.0F);
		@Pc(91) int local91 = local71 + arg2 / 4 * 18;
		@Pc(99) int local99 = local83 + arg2 % 4 * 18;
		local9.method18123(local91, local99);
		if (arg0 == arg1) {
			Class284.aClass86_9.method19982(local91 - 1, local99 - 1, 18, 18, -256);
		}
		@Pc(121) Class131_Sub4 local121 = Class651.method32890();
		local121.aClass104_Sub1_Sub1_Sub1_1 = arg1;
		local121.anInt1439 = local91 * 1862424139;
		local121.anInt1440 = local99 * -1142642293;
		local121.anInt1437 = (local91 + 16) * -558049543;
		local121.anInt1441 = (local99 + 16) * 145620327;
		client.aClass703_6.method36525(local121);
	}

	@OriginalMember(owner = "client!pt", name = "pr", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7272)
	static final void method29692(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray36 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!pt", name = "yt", descriptor = "(Lclient!yf;I)V", line = 9036)
	static final void method29693(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 2 && local12 >= 0 && local12 < client.anInt3529 * -1979292205) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass162Array1[local12].anInt3261 * -321033685;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}
