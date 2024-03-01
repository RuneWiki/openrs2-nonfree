package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public class Class225 implements Interface19 {

	@OriginalMember(owner = "client!hl", name = "ti", descriptor = "I")
	static int anInt3732;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "Lclient!co;")
	Class6 aClass6_24;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_40;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "Lclient!kz;")
	final Class291 aClass291_1;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!ny;Lclient!kz;)V", line = 15)
	Class225(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class291 arg1) {
		this.aClass359_40 = arg0;
		this.aClass291_1 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "()V", line = 21)
	@Override
	public void method24607() {
		this.aClass6_24 = Class308.method25753(this.aClass359_40, this.aClass291_1.anInt4369 * 541121155);
	}

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "()V", line = 21)
	@Override
	public void method24603() {
		this.aClass6_24 = Class308.method25753(this.aClass359_40, this.aClass291_1.anInt4369 * 541121155);
	}

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "()V", line = 21)
	@Override
	public void method24608() {
		this.aClass6_24 = Class308.method25753(this.aClass359_40, this.aClass291_1.anInt4369 * 541121155);
	}

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "(I)V", line = 21)
	@Override
	public void method24604() {
		this.aClass6_24 = Class308.method25753(this.aClass359_40, this.aClass291_1.anInt4369 * 541121155);
	}

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "()V", line = 21)
	@Override
	public void method24609() {
		this.aClass6_24 = Class308.method25753(this.aClass359_40, this.aClass291_1.anInt4369 * 541121155);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V", line = 25)
	@Override
	public void method24606(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class128.anInt3317 * 2037417253 > client.anInt3032 * 581921171 ? Class128.anInt3317 * 2037417253 : client.anInt3032 * 581921171;
		@Pc(31) int local31 = Class575.anInt5428 * 1261116487 > client.anInt3131 * -645382887 ? Class575.anInt5428 * 1261116487 : client.anInt3131 * -645382887;
		@Pc(35) int local35 = this.aClass6_24.method16772();
		@Pc(39) int local39 = this.aClass6_24.method16779();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local16 * local39 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass6_24.method16786(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "(Z)V", line = 25)
	@Override
	public void method24605(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class128.anInt3317 * 2037417253 > client.anInt3032 * 581921171 ? Class128.anInt3317 * 2037417253 : client.anInt3032 * 581921171;
		@Pc(31) int local31 = Class575.anInt5428 * 1261116487 > client.anInt3131 * -645382887 ? Class575.anInt5428 * 1261116487 : client.anInt3131 * -645382887;
		@Pc(35) int local35 = this.aClass6_24.method16772();
		@Pc(39) int local39 = this.aClass6_24.method16779();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local16 * local39 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass6_24.method16786(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)Z", line = 45)
	@Override
	public boolean method24602() {
		return this.aClass359_40.method26674(this.aClass291_1.anInt4369 * 541121155);
	}

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "()Z", line = 45)
	@Override
	public boolean method24610() {
		return this.aClass359_40.method26674(this.aClass291_1.anInt4369 * 541121155);
	}
}
