package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public class Class241 {

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	static final int anInt3784 = 2;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	static final int anInt3788 = 1;

	@OriginalMember(owner = "client!fa", name = "oo", descriptor = "J")
	public static long aLong246;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!aah;")
	Class9 aClass9_1;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "J")
	final long aLong245;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Ljava/lang/String;")
	String aString172;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
	boolean aBoolean650;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "Z")
	boolean aBoolean649;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "[Lclient!wm;")
	final Class623[] aClass623Array2;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!aah;")
	final Class9 aClass9_2;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
	int anInt3785;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	int anInt3786;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!gz;")
	Class290 aClass290_1;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	int anInt3787;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!akv;ZZLclient!fo;)V", line = 24)
	Class241(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface26 arg3) {
		if (arg1) {
			this.aLong245 = arg0.method22510() * -4189926422283937747L;
		} else {
			this.aLong245 = 4189926422283937747L;
		}
		if (arg2) {
			this.aString172 = arg0.method22520();
		}
		@Pc(25) int local25 = arg0.method22478();
		this.aBoolean650 = (local25 & 0x1) != 0;
		this.aBoolean649 = (local25 & 0x2) != 0;
		this.aClass623Array2 = new Class623[arg3.method25527().method32410()];
		@Pc(57) int local57 = arg0.method22478();
		if (local57 > this.aClass623Array2.length) {
			throw new IllegalStateException("");
		}
		@Pc(69) int local69;
		for (local69 = 0; local69 < this.aClass623Array2.length; local69++) {
			@Pc(90) Class623 local90 = this.aClass623Array2[local69] = new Class623(arg3.method25527().method32412(local69), true);
			if (local69 < local57) {
				local90.method32447(arg0.method22500());
			} else {
				local90.method32447(0);
			}
			local90.method32465(local90.method32452());
		}
		local69 = arg0.method22483();
		this.aClass9_2 = new Class9(arg3.method25537());
		for (@Pc(126) int local126 = 0; local126 < local69; local126++) {
			@Pc(136) Class438 local136 = arg3.method25537().method1949(arg0);
			this.aClass9_2.method128(local136.anInt4927 * -608978823, local136.anObject19);
		}
		this.anInt3785 = arg0.method22483() * -19505925;
		if (this.anInt3785 * 288706099 == 65535) {
			this.anInt3785 = 19505925;
		}
		this.anInt3786 = arg0.method22478() * 1768291811;
		this.aClass290_1 = (Class290) Class457.method29479(Class290.method26991(), arg0.method22478());
		this.anInt3787 = arg0.method22478() * 121192815;
	}

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "(I)Ljava/lang/String;", line = 54)
	public String method25952() {
		return this.aString172;
	}

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "(IIIIIII)I", line = 56)
	public static int method25953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)I", line = 58)
	public int method25954() {
		return this.anInt3786 * -1696518197;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "()I", line = 58)
	public int method25955() {
		return this.anInt3786 * -1696518197;
	}

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "()I", line = 58)
	public int method25956() {
		return this.anInt3786 * -1696518197;
	}

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "()I", line = 58)
	public int method25957() {
		return this.anInt3786 * -1696518197;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "()I", line = 58)
	public int method25958() {
		return this.anInt3786 * -1696518197;
	}

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "(II)V", line = 62)
	void method25959(@OriginalArg(0) int arg0) {
		this.anInt3786 = arg0 * 1768291811;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 62)
	void method25960(@OriginalArg(0) int arg0) {
		this.anInt3786 = arg0 * 1768291811;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 62)
	void method25961(@OriginalArg(0) int arg0) {
		this.anInt3786 = arg0 * 1768291811;
	}

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "(I)V", line = 62)
	void method25962(@OriginalArg(0) int arg0) {
		this.anInt3786 = arg0 * 1768291811;
	}

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "(I)I", line = 66)
	public int method25963() {
		return this.anInt3785 * 288706099;
	}

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "()I", line = 66)
	public int method25964() {
		return this.anInt3785 * 288706099;
	}

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "()I", line = 66)
	public int method25965() {
		return this.anInt3785 * 288706099;
	}

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "(I)Z", line = 67)
	static boolean method25966() {
		return !Class77_Sub1_Sub2.method1497(client.anInt3390 * -1850530127);
	}

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "(II)V", line = 70)
	void method25967(@OriginalArg(0) int arg0) {
		this.anInt3785 = arg0 * -19505925;
	}

	@OriginalMember(owner = "client!fa", name = "aj", descriptor = "(I)V", line = 70)
	void method25968(@OriginalArg(0) int arg0) {
		this.anInt3785 = arg0 * -19505925;
	}

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "(S)Z", line = 74)
	public boolean method25969() {
		return this.aBoolean649;
	}

	@OriginalMember(owner = "client!fa", name = "ai", descriptor = "()Z", line = 74)
	public boolean method25970() {
		return this.aBoolean649;
	}

	@OriginalMember(owner = "client!fa", name = "ag", descriptor = "()Z", line = 74)
	public boolean method25971() {
		return this.aBoolean649;
	}

	@OriginalMember(owner = "client!fa", name = "ak", descriptor = "(Z)V", line = 78)
	void method25972(@OriginalArg(0) boolean arg0) {
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "au", descriptor = "(Z)V", line = 78)
	void method25973(@OriginalArg(0) boolean arg0) {
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "(ZB)V", line = 78)
	void method25974(@OriginalArg(0) boolean arg0) {
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "ao", descriptor = "(Z)V", line = 78)
	void method25975(@OriginalArg(0) boolean arg0) {
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "ax", descriptor = "(Z)V", line = 78)
	void method25976(@OriginalArg(0) boolean arg0) {
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "al", descriptor = "(Z)V", line = 78)
	void method25977(@OriginalArg(0) boolean arg0) {
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "ad", descriptor = "()Lclient!gz;", line = 82)
	public Class290 method25978() {
		return this.aClass290_1;
	}

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "(I)Lclient!gz;", line = 82)
	public Class290 method25979() {
		return this.aClass290_1;
	}

	@OriginalMember(owner = "client!fa", name = "ac", descriptor = "()Lclient!gz;", line = 82)
	public Class290 method25980() {
		return this.aClass290_1;
	}

	@OriginalMember(owner = "client!fa", name = "ar", descriptor = "()Lclient!gz;", line = 82)
	public Class290 method25981() {
		return this.aClass290_1;
	}

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "(Lclient!gz;I)V", line = 86)
	void method25982(@OriginalArg(0) Class290 arg0) {
		this.aClass290_1 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "at", descriptor = "()I", line = 90)
	public int method25983() {
		return this.anInt3787 * 65224079;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)I", line = 90)
	public int method25984() {
		return this.anInt3787 * 65224079;
	}

	@OriginalMember(owner = "client!fa", name = "av", descriptor = "()I", line = 90)
	public int method25985() {
		return this.anInt3787 * 65224079;
	}

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "(IS)V", line = 94)
	void method25986(@OriginalArg(0) int arg0) {
		this.anInt3787 = arg0 * 121192815;
	}

	@OriginalMember(owner = "client!fa", name = "ae", descriptor = "(I)V", line = 94)
	void method25987(@OriginalArg(0) int arg0) {
		this.anInt3787 = arg0 * 121192815;
	}

	@OriginalMember(owner = "client!fa", name = "ah", descriptor = "(I)V", line = 94)
	void method25988(@OriginalArg(0) int arg0) {
		this.anInt3787 = arg0 * 121192815;
	}

	@OriginalMember(owner = "client!fa", name = "as", descriptor = "(I)V", line = 94)
	void method25989(@OriginalArg(0) int arg0) {
		this.anInt3787 = arg0 * 121192815;
	}

	@OriginalMember(owner = "client!fa", name = "aq", descriptor = "()J", line = 98)
	long method25990() {
		return this.aLong245 * -4405588379553237083L;
	}

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "(B)J", line = 98)
	long method25991() {
		return this.aLong245 * -4405588379553237083L;
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(S)Z", line = 102)
	public boolean method25992() {
		return this.aBoolean650;
	}

	@OriginalMember(owner = "client!fa", name = "am", descriptor = "()Z", line = 102)
	public boolean method25993() {
		return this.aBoolean650;
	}

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "(II)Lclient!wm;", line = 106)
	public Class623 method25994(@OriginalArg(0) int arg0) {
		return this.aClass623Array2[arg0];
	}

	@OriginalMember(owner = "client!fa", name = "ay", descriptor = "(I)Lclient!wm;", line = 106)
	public Class623 method25995(@OriginalArg(0) int arg0) {
		return this.aClass623Array2[arg0];
	}

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "(Lclient!fa;I)V", line = 110)
	void method25996(@OriginalArg(0) Class241 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass623Array2.length; local1++) {
			this.aClass623Array2[local1].method32447(arg0.aClass623Array2[local1].method32439());
			this.aClass623Array2[local1].method32465(this.aClass623Array2[local1].method32452());
		}
		this.aClass9_2.method132();
		@Pc(40) Iterator local40 = arg0.aClass9_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class438 local47 = (Class438) local40.next();
			this.aClass9_2.method128(local47.anInt4927 * -608978823, local47.anObject19);
		}
		this.aBoolean650 = arg0.aBoolean650;
	}

	@OriginalMember(owner = "client!fa", name = "af", descriptor = "(Lclient!fa;)V", line = 110)
	void method25997(@OriginalArg(0) Class241 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass623Array2.length; local1++) {
			this.aClass623Array2[local1].method32447(arg0.aClass623Array2[local1].method32439());
			this.aClass623Array2[local1].method32465(this.aClass623Array2[local1].method32452());
		}
		this.aClass9_2.method132();
		@Pc(40) Iterator local40 = arg0.aClass9_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class438 local47 = (Class438) local40.next();
			this.aClass9_2.method128(local47.anInt4927 * -608978823, local47.anObject19);
		}
		this.aBoolean650 = arg0.aBoolean650;
	}

	@OriginalMember(owner = "client!fa", name = "an", descriptor = "(Lclient!fa;)V", line = 110)
	void method25998(@OriginalArg(0) Class241 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass623Array2.length; local1++) {
			this.aClass623Array2[local1].method32447(arg0.aClass623Array2[local1].method32439());
			this.aClass623Array2[local1].method32465(this.aClass623Array2[local1].method32452());
		}
		this.aClass9_2.method132();
		@Pc(40) Iterator local40 = arg0.aClass9_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class438 local47 = (Class438) local40.next();
			this.aClass9_2.method128(local47.anInt4927 * -608978823, local47.anObject19);
		}
		this.aBoolean650 = arg0.aBoolean650;
	}

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(Lclient!fo;I)V", line = 125)
	public void method25999(@OriginalArg(0) Interface26 arg0) {
		if (this.aClass9_1 == null) {
			this.aClass9_1 = new Class9(arg0.method25537());
		} else {
			this.aClass9_1.method132();
		}
	}

	@OriginalMember(owner = "client!fa", name = "ab", descriptor = "(Lclient!fo;)V", line = 125)
	public void method26000(@OriginalArg(0) Interface26 arg0) {
		if (this.aClass9_1 == null) {
			this.aClass9_1 = new Class9(arg0.method25537());
		} else {
			this.aClass9_1.method132();
		}
	}

	@OriginalMember(owner = "client!fa", name = "aa", descriptor = "(Lclient!fo;)V", line = 125)
	public void method26001(@OriginalArg(0) Interface26 arg0) {
		if (this.aClass9_1 == null) {
			this.aClass9_1 = new Class9(arg0.method25537());
		} else {
			this.aClass9_1.method132();
		}
	}

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "(I)Lclient!aah;", line = 134)
	public Class9 method26002() {
		return this.aClass9_1;
	}

	@OriginalMember(owner = "client!fa", name = "ap", descriptor = "()Lclient!aah;", line = 134)
	public Class9 method26003() {
		return this.aClass9_1;
	}

	@OriginalMember(owner = "client!fa", name = "aw", descriptor = "()Lclient!aah;", line = 134)
	public Class9 method26004() {
		return this.aClass9_1;
	}

	@OriginalMember(owner = "client!fa", name = "ar", descriptor = "(ILjava/lang/String;I)V", line = 207)
	static void method26005(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(3, (long) arg0);
		local4.method21545();
		local4.aString89 = arg1;
	}

	@OriginalMember(owner = "client!fa", name = "au", descriptor = "(I)V", line = 777)
	public static final void method26006() {
		Class267.anImage4 = null;
		Class470.aFont2 = null;
	}

	@OriginalMember(owner = "client!fa", name = "ape", descriptor = "(Lclient!yf;B)V", line = 12164)
	static final void method26007(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(17) int local17 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_4.method15901();
		if (local17 != local12) {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_4, local12);
			Class667.method33150();
			client.aBoolean593 = false;
		}
	}
}
