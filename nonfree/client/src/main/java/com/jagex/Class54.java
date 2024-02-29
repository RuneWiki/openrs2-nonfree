package com.jagex;

import com.jagex.twitchtv.TwitchTV;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ace")
public abstract class Class54 implements Interface5 {

	@OriginalMember(owner = "client!ace", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_73;

	@OriginalMember(owner = "client!ace", name = "c", descriptor = "Lclient!er;")
	Class232 aClass232_59;

	@OriginalMember(owner = "client!ace", name = "<init>", descriptor = "(Lclient!pw;I)V", line = 97)
	Class54(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		this.aClass478_73 = arg0;
		this.aClass232_59 = new Class232(arg1);
	}

	@OriginalMember(owner = "client!ace", name = "w", descriptor = "(I)V", line = 103)
	void method17785(@OriginalArg(0) int arg0) {
		this.aClass232_59 = new Class232(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "p", descriptor = "(IB)V", line = 103)
	void method17786(@OriginalArg(0) int arg0) {
		this.aClass232_59 = new Class232(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "y", descriptor = "(I)V", line = 103)
	void method17787(@OriginalArg(0) int arg0) {
		this.aClass232_59 = new Class232(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "c", descriptor = "(I)V", line = 107)
	void method17788() {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25850();
		}
	}

	@OriginalMember(owner = "client!ace", name = "k", descriptor = "()V", line = 107)
	void method17789() {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25850();
		}
	}

	@OriginalMember(owner = "client!ace", name = "q", descriptor = "()V", line = 107)
	void method17790() {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25850();
		}
	}

	@OriginalMember(owner = "client!ace", name = "x", descriptor = "()V", line = 107)
	void method17791() {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25850();
		}
	}

	@OriginalMember(owner = "client!ace", name = "t", descriptor = "()V", line = 107)
	void method17792() {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25850();
		}
	}

	@OriginalMember(owner = "client!ace", name = "v", descriptor = "(II)V", line = 113)
	void method17793(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!ace", name = "u", descriptor = "(I)V", line = 113)
	void method17794(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!ace", name = "f", descriptor = "()V", line = 119)
	void method17795() {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25857();
		}
	}

	@OriginalMember(owner = "client!ace", name = "l", descriptor = "(B)V", line = 119)
	void method17796() {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25857();
		}
	}

	@OriginalMember(owner = "client!ace", name = "e", descriptor = "()V", line = 119)
	void method17797() {
		@Pc(3) Class232 local3 = this.aClass232_59;
		synchronized (this.aClass232_59) {
			this.aClass232_59.method25857();
		}
	}

	@OriginalMember(owner = "client!ace", name = "x", descriptor = "(I)I", line = 156)
	static int method17798() {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < Class574.aStringArray32.length; local1++) {
				if (Class574.aStringArray32[local1] != null && Class574.aBooleanArray31[local1]) {
					Class155.method23614().method30921(Class574.aStringArray32[local1]);
				}
			}
		} catch (@Pc(24) Exception_Sub4 local24) {
			return 3;
		}
		Class529.aTwitchTV1 = new TwitchTV();
		local1 = Class529.aTwitchTV1.InitialiseTTV(Class648.method32858());
		if (local1 == 0) {
			Class574.aBoolean807 = true;
		} else {
			Class293.method27014(10 + Class184.aString133 + local1, new RuntimeException());
		}
		return 2;
	}

	@OriginalMember(owner = "client!ace", name = "atm", descriptor = "(Lclient!yf;I)V", line = 12913)
	static final void method17799(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(24) int local24 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class496.method30164(local24, local11, arg0);
	}
}
