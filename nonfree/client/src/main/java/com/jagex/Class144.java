package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yg")
public abstract class Class144 implements Interface5 {

	@OriginalMember(owner = "client!yg", name = "v", descriptor = "I")
	int anInt2040;

	@OriginalMember(owner = "client!yg", name = "c", descriptor = "Lclient!er;")
	final Class232 aClass232_30 = new Class232(60);

	@OriginalMember(owner = "client!yg", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_44;

	@OriginalMember(owner = "client!yg", name = "p", descriptor = "(Lclient!rp;I)V", line = 16)
	public static void method14992(@OriginalArg(0) Interface59 arg0) {
		if (Class515.anInterface59_1 != null) {
			throw new IllegalStateException("");
		}
		Class515.anInterface59_1 = arg0;
	}

	@OriginalMember(owner = "client!yg", name = "p", descriptor = "(I)Lclient!ajt;", line = 19)
	static Class77_Sub20 method14993() {
		return Class77_Sub20.anInt1526 * -1174729025 == 0 ? new Class77_Sub20() : Class77_Sub20.aClass77_Sub20Array1[(Class77_Sub20.anInt1526 -= -1902157505) * -1174729025];
	}

	@OriginalMember(owner = "client!yg", name = "<init>", descriptor = "(Lclient!pw;)V", line = 206)
	Class144(@OriginalArg(0) Class478 arg0) {
		this.aClass478_44 = arg0;
	}

	@OriginalMember(owner = "client!yg", name = "p", descriptor = "(IB)V", line = 211)
	void method14994(@OriginalArg(0) int arg0) {
		this.anInt2040 = arg0 * 933504141;
		@Pc(8) Class232 local8 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25850();
		}
	}

	@OriginalMember(owner = "client!yg", name = "c", descriptor = "(I)V", line = 218)
	void method14995() {
		@Pc(3) Class232 local3 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25850();
		}
	}

	@OriginalMember(owner = "client!yg", name = "y", descriptor = "()V", line = 218)
	void method14996() {
		@Pc(3) Class232 local3 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25850();
		}
	}

	@OriginalMember(owner = "client!yg", name = "v", descriptor = "(II)V", line = 224)
	void method14997(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!yg", name = "w", descriptor = "(I)V", line = 224)
	void method14998(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!yg", name = "t", descriptor = "(I)V", line = 224)
	void method14999(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!yg", name = "q", descriptor = "(I)V", line = 224)
	void method15000(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!yg", name = "x", descriptor = "()V", line = 230)
	void method15001() {
		@Pc(3) Class232 local3 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25857();
		}
	}

	@OriginalMember(owner = "client!yg", name = "l", descriptor = "(B)V", line = 230)
	void method15002() {
		@Pc(3) Class232 local3 = this.aClass232_30;
		synchronized (this.aClass232_30) {
			this.aClass232_30.method25857();
		}
	}

	@OriginalMember(owner = "client!yg", name = "dw", descriptor = "(Lclient!yf;B)V", line = 5086)
	static final void method15003(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class192.method25435(local16, local22, arg0);
	}
}
