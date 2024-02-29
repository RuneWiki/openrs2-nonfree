package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xu")
public abstract class Class148 {

	@OriginalMember(owner = "client!xu", name = "aj", descriptor = "[Lclient!cy;")
	public static Class83[] aClass83Array6;

	@OriginalMember(owner = "client!xu", name = "c", descriptor = "Lclient!er;")
	final Class232 aClass232_38 = new Class232(2);

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "Lclient!pw;")
	Class478 aClass478_50;

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "(B)[Lclient!vb;", line = 14)
	static Class591[] method15582() {
		return new Class591[] { Class591.aClass591_3, Class591.aClass591_2, Class591.aClass591_1 };
	}

	@OriginalMember(owner = "client!xu", name = "<init>", descriptor = "(Lclient!pw;)V", line = 51)
	Class148(@OriginalArg(0) Class478 arg0) {
		this.aClass478_50 = arg0;
	}

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "(B)V", line = 56)
	void method15583() {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25850();
		}
	}

	@OriginalMember(owner = "client!xu", name = "l", descriptor = "()V", line = 56)
	void method15584() {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25850();
		}
	}

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "()V", line = 56)
	void method15585() {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25850();
		}
	}

	@OriginalMember(owner = "client!xu", name = "c", descriptor = "(II)V", line = 62)
	void method15586(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!xu", name = "w", descriptor = "(I)V", line = 62)
	void method15587(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!xu", name = "t", descriptor = "(I)V", line = 62)
	void method15588(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!xu", name = "q", descriptor = "(I)V", line = 62)
	void method15589(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "()V", line = 68)
	void method15590() {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25857();
		}
	}

	@OriginalMember(owner = "client!xu", name = "v", descriptor = "(I)V", line = 68)
	void method15591() {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25857();
		}
	}

	@OriginalMember(owner = "client!xu", name = "x", descriptor = "()V", line = 68)
	void method15592() {
		@Pc(3) Class232 local3 = this.aClass232_38;
		synchronized (this.aClass232_38) {
			this.aClass232_38.method25857();
		}
	}

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "([Lclient!gm;B)V", line = 222)
	public static void method15593(@OriginalArg(0) Class277[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class277 local9 = arg0[local1];
			if (local9.anObjectArray41 != null) {
				@Pc(17) Class77_Sub41 local17 = new Class77_Sub41();
				local17.aClass277_2 = local9;
				local17.anObjectArray4 = local9.anObjectArray41;
				Class143_Sub13.method15363(local17, 5000000);
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "(Lclient!gh;Lclient!gm;B)V", line = 443)
	static void method15594(@OriginalArg(0) Class273 arg0, @OriginalArg(1) Class277 arg1) {
		if (arg1 == null) {
			return;
		}
		@Pc(77) int local77;
		if (arg1.anInt3927 * 1365669833 == -1) {
			@Pc(123) Class277[] local123 = arg0.method26537();
			for (local77 = 0; local77 < local123.length && local123[local77] != arg1; local77++) {
			}
			if (local77 >= local123.length) {
				return;
			}
			Class684.method36267(local123, local77 + 1, local123, local77, local123.length - local77 - 1);
			local123[local123.length - 1] = arg1;
			return;
		}
		@Pc(16) Class277 local16 = arg0.method26538(arg1.anInt3876 * -742015869);
		if (local16 == null) {
			return;
		}
		if (local16.aClass277Array3 == local16.aClass277Array4) {
			local16.aClass277Array4 = new Class277[local16.aClass277Array3.length];
			local16.aClass277Array4[local16.aClass277Array4.length - 1] = arg1;
			Class684.method36267(local16.aClass277Array3, 0, local16.aClass277Array4, 0, arg1.anInt3927 * 1365669833);
			Class684.method36267(local16.aClass277Array3, arg1.anInt3927 * 1365669833 + 1, local16.aClass277Array4, arg1.anInt3927 * 1365669833, local16.aClass277Array3.length - arg1.anInt3927 * 1365669833 - 1);
			return;
		}
		local77 = 0;
		@Pc(80) Class277[] local80 = local16.aClass277Array4;
		while (local77 < local80.length && local80[local77] != arg1) {
			local77++;
		}
		if (local77 >= local80.length) {
			return;
		}
		Class684.method36267(local80, local77 + 1, local80, local77, local80.length - local77 - 1);
		local80[local16.aClass277Array4.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!xu", name = "f", descriptor = "(Lclient!aqm;Lclient!yf;S)V", line = 533)
	static final void method15595(@OriginalArg(0) Class77_Sub1_Sub7 arg0, @OriginalArg(1) Class665 arg1) {
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = Class510.method30318(arg0);
		arg1.anObjectArray45[(arg1.anInt5781 += 1460193483) * 1485266147 - 1] = Class44.method715(arg0);
		arg1.anObjectArray45[(arg1.anInt5781 += 1460193483) * 1485266147 - 1] = Class479.method29808(arg0);
		arg1.anObjectArray45[(arg1.anInt5781 += 1460193483) * 1485266147 - 1] = Exception_Sub7.method18240(arg0);
	}

	@OriginalMember(owner = "client!xu", name = "gs", descriptor = "(Lclient!yf;I)V", line = 5731)
	static final void method15596(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class143_Sub24.method15789(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xu", name = "nu", descriptor = "(Lclient!yf;B)V", line = 7024)
	static final void method15597(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class131.method23062(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xu", name = "vk", descriptor = "(Lclient!yf;I)V", line = 8478)
	static final void method15598(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class96_Sub9.method7216(local13, local23, local33, true);
	}

	@OriginalMember(owner = "client!xu", name = "aed", descriptor = "(Lclient!yf;I)V", line = 9993)
	static final void method15599(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.aBoolean11 ? 1 : 0;
	}
}
