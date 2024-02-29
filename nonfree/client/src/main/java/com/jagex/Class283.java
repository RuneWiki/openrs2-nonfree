package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public class Class283 implements Interface75 {

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "Lclient!gs;")
	public static final Class283 aClass283_4 = new Class283(0, 0);

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!gs;")
	public static final Class283 aClass283_2 = new Class283(1, 1);

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "Lclient!gs;")
	public static final Class283 aClass283_3 = new Class283(4, 2);

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "Lclient!gs;")
	public static final Class283 aClass283_7 = new Class283(5, 3);

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Lclient!gs;")
	public static final Class283 aClass283_5 = new Class283(3, 4);

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "Lclient!gs;")
	public static final Class283 aClass283_6 = new Class283(2, 5);

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
	public final int anInt3965;

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
	final int anInt3964;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", line = 11)
	public static String method26700(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class544.method30950(local16);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(II)V", line = 19)
	Class283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3965 = arg0 * 332033079;
		this.anInt3964 = arg1 * -1887543477;
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "()I", line = 25)
	@Override
	public int method36479() {
		return this.anInt3964 * 1832759907;
	}

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method36478() {
		return this.anInt3964 * 1832759907;
	}

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "()I", line = 25)
	@Override
	public int method36477() {
		return this.anInt3964 * 1832759907;
	}

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "(Lclient!dx;IIIIII)Lclient!dv;", line = 27)
	public static Class84 method26701(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) long local2 = (long) arg5;
		@Pc(7) Class84 local7 = (Class84) Class73.aClass232_5.method25835(local2);
		@Pc(9) short local9 = 2055;
		if (local7 == null) {
			@Pc(16) Class216 local16 = Class216.method25655(Class173.aClass478_87, arg5, 0);
			if (local16 == null) {
				return null;
			}
			if (local16.anInt3733 < 13) {
				local16.method25695(2);
			}
			local7 = arg0.method20115(local16, local9, Class552.anInt5222 * 2007436411, 64, 768);
			Class73.aClass232_5.method25844(local7, local2);
		}
		local7 = local7.method6794((byte) 6, local9, true);
		if (arg1 != 0) {
			local7.method6797(arg1);
		}
		if (arg2 != 0) {
			local7.method6799(arg2);
		}
		if (arg3 != 0) {
			local7.method6800(arg3);
		}
		if (arg4 != 0) {
			local7.method6872(0, arg4, 0);
		}
		return local7;
	}

	@OriginalMember(owner = "client!gs", name = "z", descriptor = "(I)I", line = 206)
	public static int method26702() {
		return Class529.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!gs", name = "im", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6097)
	static final void method26703(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3921 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 767846787;
	}

	@OriginalMember(owner = "client!gs", name = "qg", descriptor = "(Lclient!yf;I)V", line = 7567)
	static final void method26704(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3910 * 1843164247;
	}

	@OriginalMember(owner = "client!gs", name = "zk", descriptor = "(Lclient!yf;I)V", line = 9048)
	static final void method26705(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local13.startsWith(Class152.method17433(0)) || local13.startsWith(Class152.method17433(1))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class255.method26207(local13);
	}

	@OriginalMember(owner = "client!gs", name = "ata", descriptor = "(Lclient!yf;I)V", line = 12794)
	static final void method26706(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class35_Sub11.aClass273Array1[local12] == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
			return;
		}
		@Pc(40) String local40 = Class35_Sub11.aClass273Array1[local12].aClass277Array2[0].aString181;
		if (local40 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local40.substring(0, local40.indexOf(58));
		}
	}
}
