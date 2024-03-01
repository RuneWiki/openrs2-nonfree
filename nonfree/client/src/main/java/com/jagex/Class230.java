package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public class Class230 implements Interface19 {

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
	static int anInt3737;

	@OriginalMember(owner = "client!hv", name = "is", descriptor = "J")
	static long aLong247;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Lclient!kn;")
	final Class282 aClass282_1;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Lclient!hm;")
	final Class226 aClass226_2;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!hm;Lclient!kn;)V", line = 13)
	Class230(@OriginalArg(0) Class226 arg0, @OriginalArg(1) Class282 arg1) {
		this.aClass282_1 = arg1;
		this.aClass226_2 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "(Ljava/lang/CharSequence;I)J", line = 16)
	static long method24544(@OriginalArg(0) CharSequence arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "(I)Z", line = 19)
	@Override
	public boolean method24602() {
		return this.aClass226_2.method24469();
	}

	@OriginalMember(owner = "client!hv", name = "y", descriptor = "()Z", line = 19)
	@Override
	public boolean method24610() {
		return this.aClass226_2.method24469();
	}

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "(I)V", line = 22)
	@Override
	public void method24604() {
	}

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "()V", line = 22)
	@Override
	public void method24603() {
	}

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "()V", line = 22)
	@Override
	public void method24608() {
	}

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "()V", line = 22)
	@Override
	public void method24607() {
	}

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "()V", line = 22)
	@Override
	public void method24609() {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZI)V", line = 25)
	@Override
	public void method24606(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class219 local9 = this.aClass226_2.method24471(this.aClass282_1.anInt4349 * -1041567667);
		if (local9 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass282_1.aClass277_14.method25394(this.aClass282_1.anInt4347 * -1621409295, client.anInt3032 * 581921171) + this.aClass282_1.anInt4346 * 784139337;
		@Pc(52) int local52 = this.aClass282_1.aClass276_14.method25383(this.aClass282_1.anInt4348 * -1317051681, client.anInt3131 * -645382887) + this.aClass282_1.anInt4344 * 493738921;
		if (this.aClass282_1.aBoolean706) {
			Class613.aClass21_13.method17068(local32, local52, this.aClass282_1.anInt4347 * -1621409295, this.aClass282_1.anInt4348 * -1317051681, this.aClass282_1.anInt4343 * -1704387833, 0);
		}
		local52 += this.method24543(Class568.aClass14_13, local9.aString186, local32, local52, 5) * 12;
		local52 += 8;
		if (this.aClass282_1.aBoolean706) {
			Class613.aClass21_13.method17024(local32, local52, this.aClass282_1.anInt4347 * -1621409295 + local32 - 1, local52, this.aClass282_1.anInt4343 * -1704387833, 0);
		}
		local52++;
		local52 += this.method24543(Class568.aClass14_13, local9.aString187, local32, local52, 5) * 12;
		local52 += 5;
		@Pc(144) int local144 = local52 + this.method24543(Class568.aClass14_13, local9.aString185, local32, local52, 5) * 12;
	}

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "(Z)V", line = 25)
	@Override
	public void method24605(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class219 local9 = this.aClass226_2.method24471(this.aClass282_1.anInt4349 * -1041567667);
		if (local9 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass282_1.aClass277_14.method25394(this.aClass282_1.anInt4347 * -1621409295, client.anInt3032 * 581921171) + this.aClass282_1.anInt4346 * 784139337;
		@Pc(52) int local52 = this.aClass282_1.aClass276_14.method25383(this.aClass282_1.anInt4348 * -1317051681, client.anInt3131 * -645382887) + this.aClass282_1.anInt4344 * 493738921;
		if (this.aClass282_1.aBoolean706) {
			Class613.aClass21_13.method17068(local32, local52, this.aClass282_1.anInt4347 * -1621409295, this.aClass282_1.anInt4348 * -1317051681, this.aClass282_1.anInt4343 * -1704387833, 0);
		}
		local52 += this.method24543(Class568.aClass14_13, local9.aString186, local32, local52, 5) * 12;
		local52 += 8;
		if (this.aClass282_1.aBoolean706) {
			Class613.aClass21_13.method17024(local32, local52, this.aClass282_1.anInt4347 * -1621409295 + local32 - 1, local52, this.aClass282_1.anInt4343 * -1704387833, 0);
		}
		local52++;
		local52 += this.method24543(Class568.aClass14_13, local9.aString187, local32, local52, 5) * 12;
		local52 += 5;
		@Pc(144) int local144 = local52 + this.method24543(Class568.aClass14_13, local9.aString185, local32, local52, 5) * 12;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(Lclient!dw;Ljava/lang/String;III)I", line = 41)
	int method24542(@OriginalArg(0) Class14 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0.method3283(arg1, arg4 + arg2, arg4 + arg3, this.aClass282_1.anInt4347 * -1621409295 - arg4 * 2, this.aClass282_1.anInt4348 * -1317051681 - arg4 * 2, this.aClass282_1.anInt4345 * -549392459, this.aClass282_1.anInt4350 * -816029511, 0, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(Lclient!dw;Ljava/lang/String;IIIB)I", line = 41)
	int method24543(@OriginalArg(0) Class14 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0.method3283(arg1, arg4 + arg2, arg4 + arg3, this.aClass282_1.anInt4347 * -1621409295 - arg4 * 2, this.aClass282_1.anInt4348 * -1317051681 - arg4 * 2, this.aClass282_1.anInt4345 * -549392459, this.aClass282_1.anInt4350 * -816029511, 0, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;", line = 194)
	public static String method24545(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg2.length();
		@Pc(7) int local7 = local2;
		@Pc(11) int local11 = local5 - 1;
		if (local11 != 0) {
			@Pc(15) int local15 = 0;
			while (true) {
				local15 = arg0.indexOf(arg1, local15);
				if (local15 < 0) {
					break;
				}
				local15++;
				local7 += local11;
			}
		}
		@Pc(34) StringBuilder local34 = new StringBuilder(local7);
		@Pc(36) int local36 = 0;
		while (true) {
			@Pc(41) int local41 = arg0.indexOf(arg1, local36);
			if (local41 < 0) {
				local34.append(arg0.substring(local36));
				return local34.toString();
			}
			local34.append(arg0.substring(local36, local41));
			local34.append(arg2);
			local36 = local41 + 1;
		}
	}

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 221)
	public static String[] method24546(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class422.method27874(arg0, arg1);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!hv", name = "aii", descriptor = "(Lclient!vs;I)V", line = 10601)
	static final void method24548(@OriginalArg(0) Class536 arg0) {
		if (Class72.anInt2086 * 81180077 == 3) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) ((double) Class80.aClass23_Sub1_1.method5836() * 2607.5945876176133D) >> 3;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) client.aFloat238 >> 3;
		}
	}

	@OriginalMember(owner = "client!hv", name = "aks", descriptor = "(Lclient!vs;I)V", line = 11002)
	static final void method24547(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 624249098;
		@Pc(18) boolean local18 = arg0.anIntArray496[arg0.anInt5319 * 960738381] == 1;
		@Pc(33) boolean local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		Class80.aClass23_Sub1_1.method5819(local18, local33);
	}
}
