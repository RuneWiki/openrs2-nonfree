package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public abstract class Class134 {

	@OriginalMember(owner = "client!uo", name = "ap", descriptor = "I")
	static int anInt1572;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "Lclient!er;")
	Class232 aClass232_20 = new Class232(20);

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_35;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!pw;)V", line = 93)
	Class134(@OriginalArg(0) Class478 arg0) {
		this.aClass478_35 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "()V", line = 98)
	void method13694() {
		@Pc(3) Class232 local3 = this.aClass232_20;
		synchronized (this.aClass232_20) {
			this.aClass232_20.method25850();
		}
	}

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "(B)V", line = 98)
	void method13695() {
		@Pc(3) Class232 local3 = this.aClass232_20;
		synchronized (this.aClass232_20) {
			this.aClass232_20.method25850();
		}
	}

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "()V", line = 98)
	void method13696() {
		@Pc(3) Class232 local3 = this.aClass232_20;
		synchronized (this.aClass232_20) {
			this.aClass232_20.method25850();
		}
	}

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "(I)V", line = 104)
	void method13697(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_20;
		synchronized (this.aClass232_20) {
			this.aClass232_20.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(IS)V", line = 104)
	void method13698(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_20;
		synchronized (this.aClass232_20) {
			this.aClass232_20.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "()V", line = 110)
	void method13699() {
		@Pc(3) Class232 local3 = this.aClass232_20;
		synchronized (this.aClass232_20) {
			this.aClass232_20.method25857();
		}
	}

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "(B)V", line = 110)
	void method13700() {
		@Pc(3) Class232 local3 = this.aClass232_20;
		synchronized (this.aClass232_20) {
			this.aClass232_20.method25857();
		}
	}

	@OriginalMember(owner = "client!uo", name = "aw", descriptor = "(IIIII)V", line = 313)
	static void method13701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class77_Sub1_Sub6 local9 = Class456.method29469(20, (long) arg1 << 32 | (long) arg0);
		local9.method21545();
		local9.anInt2959 = arg2 * 517206857;
		local9.anInt2953 = arg3 * -1621355885;
	}

	@OriginalMember(owner = "client!uo", name = "fm", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5410)
	static final void method13702(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean682 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "abd", descriptor = "(Lclient!yf;I)V", line = 9408)
	static final void method13703(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass497ArrayArray1[local23][local13].anInt5060 * -1999362577;
	}

	@OriginalMember(owner = "client!uo", name = "auo", descriptor = "(Lclient!yf;I)V", line = 13007)
	static final void method13704(@OriginalArg(0) Class665 arg0) {
		@Pc(1) String local1 = null;
		if (Class386.aClass355_1 != null) {
			local1 = Class386.aClass355_1.method27957();
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local1;
	}
}
