package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
	int anInt941 = 0;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!pw;Lclient!ahm;)V", line = 11)
	Class98_Sub1(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class121_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(ZB)V", line = 15)
	@Override
	public void method27921(@OriginalArg(0) boolean arg0) {
		@Pc(17) int local17 = this.aClass121_2.aClass410_5.method28569(this.aClass83_7.method18121(), client.anInt3394 * -321474631) + this.aClass121_2.anInt1203 * -1151439181;
		@Pc(35) int local35 = this.aClass121_2.aClass402_5.method28502(this.aClass83_7.method18198(), client.anInt3464 * 43072843) + this.aClass121_2.anInt1204 * -963484815;
		this.aClass83_7.method18142((float) (local17 + this.aClass83_7.method18121() / 2), (float) (local35 + this.aClass83_7.method18198() / 2), 4096, this.anInt941 * -1631547953);
		this.anInt941 += ((Class121_Sub1) this.aClass121_2).anInt1206 * 658027923;
	}

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "(Z)V", line = 15)
	@Override
	public void method27918(@OriginalArg(0) boolean arg0) {
		@Pc(17) int local17 = this.aClass121_2.aClass410_5.method28569(this.aClass83_7.method18121(), client.anInt3394 * -321474631) + this.aClass121_2.anInt1203 * -1151439181;
		@Pc(35) int local35 = this.aClass121_2.aClass402_5.method28502(this.aClass83_7.method18198(), client.anInt3464 * 43072843) + this.aClass121_2.anInt1204 * -963484815;
		this.aClass83_7.method18142((float) (local17 + this.aClass83_7.method18121() / 2), (float) (local35 + this.aClass83_7.method18198() / 2), 4096, this.anInt941 * -1631547953);
		this.anInt941 += ((Class121_Sub1) this.aClass121_2).anInt1206 * 658027923;
	}
}
