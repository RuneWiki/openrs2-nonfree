package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agm")
public class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!agm", name = "t", descriptor = "Lclient!cy;")
	Class83 aClass83_14;

	@OriginalMember(owner = "client!agm", name = "<init>", descriptor = "(Lclient!pw;Lclient!pw;Lclient!ahh;)V", line = 14)
	Class101_Sub2(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class118_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!agm", name = "p", descriptor = "(S)V", line = 18)
	@Override
	public void method27917() {
		super.method27917();
		this.aClass83_14 = Class273.method26540(this.aClass478_81, ((Class118_Sub2) this.aClass118_5).anInt1163 * 868775843);
	}

	@OriginalMember(owner = "client!agm", name = "y", descriptor = "()V", line = 18)
	@Override
	public void method27919() {
		super.method27917();
		this.aClass83_14 = Class273.method26540(this.aClass478_81, ((Class118_Sub2) this.aClass118_5).anInt1163 * 868775843);
	}

	@OriginalMember(owner = "client!agm", name = "r", descriptor = "(ZIIB)V", line = 23)
	@Override
	void method20891(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20884() * -1607607997 * this.aClass118_5.anInt2922 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class284.aClass86_9.method20142(local14);
		Class284.aClass86_9.method20151(arg1, arg2 + 2, arg1 + local11, this.aClass118_5.anInt2923 * -228886179 + arg2);
		this.aClass83_14.method18133(arg1, arg2 + 2, this.aClass118_5.anInt2922 * -1607607997, this.aClass118_5.anInt2923 * -228886179);
		Class284.aClass86_9.method20151(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!agm", name = "i", descriptor = "(ZII)V", line = 23)
	@Override
	void method20894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method20884() * -1607607997 * this.aClass118_5.anInt2922 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class284.aClass86_9.method20142(local14);
		Class284.aClass86_9.method20151(arg0, arg1 + 2, arg0 + local11, this.aClass118_5.anInt2923 * -228886179 + arg1);
		this.aClass83_14.method18133(arg0, arg1 + 2, this.aClass118_5.anInt2922 * -1607607997, this.aClass118_5.anInt2923 * -228886179);
		Class284.aClass86_9.method20151(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!agm", name = "k", descriptor = "(ZII)V", line = 23)
	@Override
	void method20895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method20884() * -1607607997 * this.aClass118_5.anInt2922 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class284.aClass86_9.method20142(local14);
		Class284.aClass86_9.method20151(arg0, arg1 + 2, arg0 + local11, this.aClass118_5.anInt2923 * -228886179 + arg1);
		this.aClass83_14.method18133(arg0, arg1 + 2, this.aClass118_5.anInt2922 * -1607607997, this.aClass118_5.anInt2923 * -228886179);
		Class284.aClass86_9.method20151(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!agm", name = "u", descriptor = "(ZII)V", line = 23)
	@Override
	void method20892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method20884() * -1607607997 * this.aClass118_5.anInt2922 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class284.aClass86_9.method20142(local14);
		Class284.aClass86_9.method20151(arg0, arg1 + 2, arg0 + local11, this.aClass118_5.anInt2923 * -228886179 + arg1);
		this.aClass83_14.method18133(arg0, arg1 + 2, this.aClass118_5.anInt2922 * -1607607997, this.aClass118_5.anInt2923 * -228886179);
		Class284.aClass86_9.method20151(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!agm", name = "s", descriptor = "(ZIIS)V", line = 32)
	@Override
	void method20890(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class284.aClass86_9.method20087(arg1 - 2, arg2, this.aClass118_5.anInt2922 * -1607607997 + 4, this.aClass118_5.anInt2923 * -228886179 + 2, ((Class118_Sub2) this.aClass118_5).anInt1164 * -1419672847, 0);
		Class284.aClass86_9.method20087(arg1 - 1, arg2 + 1, this.aClass118_5.anInt2922 * -1607607997 + 2, this.aClass118_5.anInt2923 * -228886179, 0, 0);
	}

	@OriginalMember(owner = "client!agm", name = "z", descriptor = "(ZII)V", line = 32)
	@Override
	void method20893(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class284.aClass86_9.method20087(arg1 - 2, arg2, this.aClass118_5.anInt2922 * -1607607997 + 4, this.aClass118_5.anInt2923 * -228886179 + 2, ((Class118_Sub2) this.aClass118_5).anInt1164 * -1419672847, 0);
		Class284.aClass86_9.method20087(arg1 - 1, arg2 + 1, this.aClass118_5.anInt2922 * -1607607997 + 2, this.aClass118_5.anInt2923 * -228886179, 0, 0);
	}

	@OriginalMember(owner = "client!agm", name = "j", descriptor = "(ZII)V", line = 32)
	@Override
	void method20889(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class284.aClass86_9.method20087(arg1 - 2, arg2, this.aClass118_5.anInt2922 * -1607607997 + 4, this.aClass118_5.anInt2923 * -228886179 + 2, ((Class118_Sub2) this.aClass118_5).anInt1164 * -1419672847, 0);
		Class284.aClass86_9.method20087(arg1 - 1, arg2 + 1, this.aClass118_5.anInt2922 * -1607607997 + 2, this.aClass118_5.anInt2923 * -228886179, 0, 0);
	}

	@OriginalMember(owner = "client!agm", name = "w", descriptor = "()Z", line = 37)
	@Override
	public boolean method27920() {
		return super.method27915() ? this.aClass478_81.method29730(((Class118_Sub2) this.aClass118_5).anInt1163 * 868775843) : false;
	}

	@OriginalMember(owner = "client!agm", name = "x", descriptor = "()Z", line = 37)
	@Override
	public boolean method27923() {
		return super.method27915() ? this.aClass478_81.method29730(((Class118_Sub2) this.aClass118_5).anInt1163 * 868775843) : false;
	}

	@OriginalMember(owner = "client!agm", name = "v", descriptor = "(I)Z", line = 37)
	@Override
	public boolean method27915() {
		return super.method27915() ? this.aClass478_81.method29730(((Class118_Sub2) this.aClass118_5).anInt1163 * 868775843) : false;
	}

	@OriginalMember(owner = "client!agm", name = "t", descriptor = "()Z", line = 37)
	@Override
	public boolean method27924() {
		return super.method27915() ? this.aClass478_81.method29730(((Class118_Sub2) this.aClass118_5).anInt1163 * 868775843) : false;
	}

	@OriginalMember(owner = "client!agm", name = "d", descriptor = "()Z", line = 37)
	@Override
	public boolean method27922() {
		return super.method27915() ? this.aClass478_81.method29730(((Class118_Sub2) this.aClass118_5).anInt1163 * 868775843) : false;
	}

	@OriginalMember(owner = "client!agm", name = "q", descriptor = "()Z", line = 37)
	@Override
	public boolean method27916() {
		return super.method27915() ? this.aClass478_81.method29730(((Class118_Sub2) this.aClass118_5).anInt1163 * 868775843) : false;
	}

	@OriginalMember(owner = "client!agm", name = "en", descriptor = "(Lclient!yf;S)V", line = 5285)
	static final void method8613(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class594.method31850(local11, local14, arg0);
	}
}
