package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aan")
public abstract class Class14 implements Interface5 {

	@OriginalMember(owner = "client!aan", name = "mo", descriptor = "I")
	public static int anInt2381;

	@OriginalMember(owner = "client!aan", name = "q", descriptor = "I")
	int anInt2380;

	@OriginalMember(owner = "client!aan", name = "l", descriptor = "Lclient!er;")
	final Class232 aClass232_46 = new Class232(50);

	@OriginalMember(owner = "client!aan", name = "y", descriptor = "Lclient!vw;")
	final Class607 aClass607_2 = new Class607(250);

	@OriginalMember(owner = "client!aan", name = "w", descriptor = "Lclient!aaj;")
	final Class11 aClass11_2 = new Class11();

	@OriginalMember(owner = "client!aan", name = "p", descriptor = "Lclient!yi;")
	final Class667 aClass667_4;

	@OriginalMember(owner = "client!aan", name = "c", descriptor = "Z")
	boolean aBoolean371;

	@OriginalMember(owner = "client!aan", name = "v", descriptor = "Lclient!pw;")
	final Class478 aClass478_58;

	@OriginalMember(owner = "client!aan", name = "t", descriptor = "Lclient!as;")
	final Interface13 anInterface13_9;

	@OriginalMember(owner = "client!aan", name = "x", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray20;

	@OriginalMember(owner = "client!aan", name = "d", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray21;

	@OriginalMember(owner = "client!aan", name = "s", descriptor = "(Lclient!alh;Lclient!alh;IZIZB)I", line = 137)
	static int method17031(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class145_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = Class300.method27112(arg0, arg1, arg2, arg3);
		if (local6 != 0) {
			return arg3 ? -local6 : local6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = Class300.method27112(arg0, arg1, arg4, arg5);
			return arg5 ? -local28 : local28;
		}
	}

	@OriginalMember(owner = "client!aan", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;ZLclient!pw;Lclient!as;)V", line = 845)
	Class14(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class478 arg3, @OriginalArg(4) Interface13 arg4) {
		this.aClass667_4 = arg1;
		this.aBoolean371 = arg2;
		this.aClass478_58 = arg3;
		this.anInterface13_9 = arg4;
		if (arg0 == Class670.aClass670_5) {
			this.aStringArray20 = new String[] { null, null, Class44.aClass44_14.method713(this.aClass667_4), null, null, Class44.aClass44_129.method713(this.aClass667_4) };
		} else {
			this.aStringArray20 = new String[] { null, null, Class44.aClass44_14.method713(this.aClass667_4), null, null, null };
		}
		this.aStringArray21 = new String[] { null, null, null, null, Class44.aClass44_131.method713(this.aClass667_4) };
	}

	@OriginalMember(owner = "client!aan", name = "p", descriptor = "(Lclient!dx;IIIIILclient!wr;I)Lclient!cy;", line = 856)
	Class83 method17032(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class628 arg6) {
		this.aClass11_2.anInt32 = arg0.anInt2780 * 1219695045;
		this.aClass11_2.anInt31 = arg1 * 1254922251;
		this.aClass11_2.anInt34 = arg2 * 192735439;
		this.aClass11_2.anInt33 = arg3 * -1566186789;
		this.aClass11_2.anInt35 = arg4 * 823886211;
		this.aClass11_2.anInt30 = arg5 * 1790782807;
		this.aClass11_2.aBoolean5 = arg6 != null;
		return (Class83) this.aClass607_2.method32080(this.aClass11_2);
	}

	@OriginalMember(owner = "client!aan", name = "x", descriptor = "(Lclient!dx;IIIIILclient!wr;)Lclient!cy;", line = 856)
	Class83 method17033(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class628 arg6) {
		this.aClass11_2.anInt32 = arg0.anInt2780 * 1219695045;
		this.aClass11_2.anInt31 = arg1 * 1254922251;
		this.aClass11_2.anInt34 = arg2 * 192735439;
		this.aClass11_2.anInt33 = arg3 * -1566186789;
		this.aClass11_2.anInt35 = arg4 * 823886211;
		this.aClass11_2.anInt30 = arg5 * 1790782807;
		this.aClass11_2.aBoolean5 = arg6 != null;
		return (Class83) this.aClass607_2.method32080(this.aClass11_2);
	}

	@OriginalMember(owner = "client!aan", name = "k", descriptor = "(Lclient!dx;IIIIILclient!wr;)Lclient!cy;", line = 856)
	Class83 method17034(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class628 arg6) {
		this.aClass11_2.anInt32 = arg0.anInt2780 * 1219695045;
		this.aClass11_2.anInt31 = arg1 * 1254922251;
		this.aClass11_2.anInt34 = arg2 * 192735439;
		this.aClass11_2.anInt33 = arg3 * -1566186789;
		this.aClass11_2.anInt35 = arg4 * 823886211;
		this.aClass11_2.anInt30 = arg5 * 1790782807;
		this.aClass11_2.aBoolean5 = arg6 != null;
		return (Class83) this.aClass607_2.method32080(this.aClass11_2);
	}

	@OriginalMember(owner = "client!aan", name = "c", descriptor = "(Lclient!dx;Lclient!dx;IIIIZZILclient!dj;Lclient!wr;Lclient!ws;Lclient!as;I)Lclient!cy;", line = 867)
	Class83 method17035(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class94 arg9, @OriginalArg(10) Class628 arg10, @OriginalArg(11) Class629 arg11, @OriginalArg(12) Interface13 arg12) {
		if (!arg7) {
			@Pc(12) Class83 local12 = this.method17032(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(22) Class18 local22 = (Class18) arg12.method18319(arg2);
		if (arg3 > 1 && local22.anIntArray3 != null) {
			@Pc(30) int local30 = -1;
			for (@Pc(32) int local32 = 0; local32 < 10; local32++) {
				if (arg3 >= local22.anIntArray6[local32] && local22.anIntArray6[local32] != 0) {
					local30 = local22.anIntArray3[local32];
				}
			}
			if (local30 != -1) {
				local22 = (Class18) arg12.method18319(local30);
			}
		}
		@Pc(77) int[] local77 = local22.method355(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11);
		if (local77 == null) {
			return null;
		}
		@Pc(93) Class83 local93;
		if (arg7) {
			local93 = arg0.method20010(local77, 0, 36, 36, 32);
		} else {
			local93 = arg1.method20010(local77, 0, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(109) Class11 local109 = new Class11();
			local109.anInt32 = arg1.anInt2780 * 1219695045;
			local109.anInt31 = arg2 * 1254922251;
			local109.anInt34 = arg3 * 192735439;
			local109.anInt33 = arg4 * -1566186789;
			local109.anInt35 = arg5 * 823886211;
			local109.anInt30 = arg8 * 1790782807;
			local109.aBoolean5 = arg10 != null;
			this.aClass607_2.method32087(local93, local109);
		}
		return local93;
	}

	@OriginalMember(owner = "client!aan", name = "u", descriptor = "(Lclient!dx;Lclient!dx;IIIIZZILclient!dj;Lclient!wr;Lclient!ws;Lclient!as;)Lclient!cy;", line = 867)
	Class83 method17036(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class94 arg9, @OriginalArg(10) Class628 arg10, @OriginalArg(11) Class629 arg11, @OriginalArg(12) Interface13 arg12) {
		if (!arg7) {
			@Pc(12) Class83 local12 = this.method17032(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(22) Class18 local22 = (Class18) arg12.method18319(arg2);
		if (arg3 > 1 && local22.anIntArray3 != null) {
			@Pc(30) int local30 = -1;
			for (@Pc(32) int local32 = 0; local32 < 10; local32++) {
				if (arg3 >= local22.anIntArray6[local32] && local22.anIntArray6[local32] != 0) {
					local30 = local22.anIntArray3[local32];
				}
			}
			if (local30 != -1) {
				local22 = (Class18) arg12.method18319(local30);
			}
		}
		@Pc(77) int[] local77 = local22.method355(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11);
		if (local77 == null) {
			return null;
		}
		@Pc(93) Class83 local93;
		if (arg7) {
			local93 = arg0.method20010(local77, 0, 36, 36, 32);
		} else {
			local93 = arg1.method20010(local77, 0, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(109) Class11 local109 = new Class11();
			local109.anInt32 = arg1.anInt2780 * 1219695045;
			local109.anInt31 = arg2 * 1254922251;
			local109.anInt34 = arg3 * 192735439;
			local109.anInt33 = arg4 * -1566186789;
			local109.anInt35 = arg5 * 823886211;
			local109.anInt30 = arg8 * 1790782807;
			local109.aBoolean5 = arg10 != null;
			this.aClass607_2.method32087(local93, local109);
		}
		return local93;
	}

	@OriginalMember(owner = "client!aan", name = "v", descriptor = "(ZB)V", line = 899)
	void method17037(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean371 != arg0) {
			this.aBoolean371 = arg0;
			this.method17040();
		}
	}

	@OriginalMember(owner = "client!aan", name = "l", descriptor = "(II)V", line = 905)
	void method17038(@OriginalArg(0) int arg0) {
		this.anInt2380 = arg0 * -1905823133;
		@Pc(8) Class232 local8 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25850();
		}
	}

	@OriginalMember(owner = "client!aan", name = "e", descriptor = "(I)V", line = 905)
	void method17039(@OriginalArg(0) int arg0) {
		this.anInt2380 = arg0 * -1905823133;
		@Pc(8) Class232 local8 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25850();
		}
	}

	@OriginalMember(owner = "client!aan", name = "y", descriptor = "(I)V", line = 912)
	void method17040() {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25850();
		}
		@Pc(20) Class607 local20 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32098();
		}
	}

	@OriginalMember(owner = "client!aan", name = "f", descriptor = "()V", line = 912)
	void method17041() {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25850();
		}
		@Pc(20) Class607 local20 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32098();
		}
	}

	@OriginalMember(owner = "client!aan", name = "w", descriptor = "(I)V", line = 921)
	void method17042() {
		@Pc(3) Class607 local3 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32098();
		}
	}

	@OriginalMember(owner = "client!aan", name = "o", descriptor = "()V", line = 921)
	void method17043() {
		@Pc(3) Class607 local3 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32098();
		}
	}

	@OriginalMember(owner = "client!aan", name = "b", descriptor = "()V", line = 921)
	void method17044() {
		@Pc(3) Class607 local3 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32098();
		}
	}

	@OriginalMember(owner = "client!aan", name = "n", descriptor = "(I)V", line = 927)
	void method17045(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25847(arg0);
		}
		@Pc(21) Class607 local21 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32095(arg0);
		}
	}

	@OriginalMember(owner = "client!aan", name = "t", descriptor = "(IB)V", line = 927)
	void method17046(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25847(arg0);
		}
		@Pc(21) Class607 local21 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32095(arg0);
		}
	}

	@OriginalMember(owner = "client!aan", name = "h", descriptor = "(I)V", line = 927)
	void method17047(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25847(arg0);
		}
		@Pc(21) Class607 local21 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32095(arg0);
		}
	}

	@OriginalMember(owner = "client!aan", name = "a", descriptor = "(I)V", line = 927)
	void method17048(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25847(arg0);
		}
		@Pc(21) Class607 local21 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32095(arg0);
		}
	}

	@OriginalMember(owner = "client!aan", name = "m", descriptor = "(I)V", line = 927)
	void method17049(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25847(arg0);
		}
		@Pc(21) Class607 local21 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32095(arg0);
		}
	}

	@OriginalMember(owner = "client!aan", name = "q", descriptor = "(B)V", line = 936)
	void method17050() {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25857();
		}
		@Pc(20) Class607 local20 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32101();
		}
	}

	@OriginalMember(owner = "client!aan", name = "aj", descriptor = "()V", line = 936)
	void method17051() {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25857();
		}
		@Pc(20) Class607 local20 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32101();
		}
	}

	@OriginalMember(owner = "client!aan", name = "ai", descriptor = "()V", line = 936)
	void method17052() {
		@Pc(3) Class232 local3 = this.aClass232_46;
		synchronized (this.aClass232_46) {
			this.aClass232_46.method25857();
		}
		@Pc(20) Class607 local20 = this.aClass607_2;
		synchronized (this.aClass607_2) {
			this.aClass607_2.method32101();
		}
	}
}
