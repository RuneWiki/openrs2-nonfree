package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public class Class77 {

	@OriginalMember(owner = "client!sn", name = "dt", descriptor = "Lclient!eo;")
	public static Interface24 anInterface24_117;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "Lclient!sn;")
	public Class77 aClass77_221;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "J")
	public long aLong229;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!sn;")
	public Class77 aClass77_222;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "()V", line = 9)
	public void method24061() {
		if (this.aClass77_221 != null) {
			this.aClass77_221.aClass77_222 = this.aClass77_222;
			this.aClass77_222.aClass77_221 = this.aClass77_221;
			this.aClass77_222 = null;
			this.aClass77_221 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "()V", line = 9)
	public void method24062() {
		if (this.aClass77_221 != null) {
			this.aClass77_221.aClass77_222 = this.aClass77_222;
			this.aClass77_222.aClass77_221 = this.aClass77_221;
			this.aClass77_222 = null;
			this.aClass77_221 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "(B)V", line = 9)
	public void method24063() {
		if (this.aClass77_221 != null) {
			this.aClass77_221.aClass77_222 = this.aClass77_222;
			this.aClass77_222.aClass77_221 = this.aClass77_221;
			this.aClass77_222 = null;
			this.aClass77_221 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "()Z", line = 17)
	public boolean method24064() {
		return this.aClass77_221 != null;
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "()Z", line = 17)
	public boolean method24065() {
		return this.aClass77_221 != null;
	}

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "(I)Z", line = 17)
	public boolean method24066() {
		return this.aClass77_221 != null;
	}

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "(Lclient!akv;I)Lclient!uh;", line = 27)
	static Class576 method24067(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(7) int local7 = arg0.method22478();
		return new Class576(local3, local7);
	}

	@OriginalMember(owner = "client!sn", name = "na", descriptor = "(Lclient!yf;B)V", line = 6975)
	static final void method24068(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class131.method23062(local16, local22, arg0);
	}
}
