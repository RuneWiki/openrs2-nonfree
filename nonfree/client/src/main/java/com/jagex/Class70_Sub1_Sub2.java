package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajx")
public class Class70_Sub1_Sub2 extends Class70_Sub1 {

	@OriginalMember(owner = "client!ajx", name = "l", descriptor = "Lclient!ew;")
	final Class161 aClass161_12 = new Class161(64);

	@OriginalMember(owner = "client!ajx", name = "g", descriptor = "Lclient!ny;")
	final Class359 aClass359_24;

	@OriginalMember(owner = "client!ajx", name = "<init>", descriptor = "(Lclient!vz;Lclient!nw;Lclient!vk;Lclient!ny;)V", line = 16)
	public Class70_Sub1_Sub2(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class530 arg2, @OriginalArg(3) Class359 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method26682(arg1.method9491().anInt3631 * -1739932335));
		this.aClass359_24 = arg3;
	}

	@OriginalMember(owner = "client!ajx", name = "g", descriptor = "(II)Lclient!cy;", line = 22)
	@Override
	public Class11 method14717(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_12;
		synchronized (this.aClass161_12) {
			@Pc(11) Class11_Sub2 local11 = (Class11_Sub2) this.aClass161_12.method23219((long) arg0);
			if (local11 == null) {
				@Pc(26) byte[] local26 = this.aClass359_24.method26713(this.aClass43_72.method9491().anInt3631 * -1739932335, arg0);
				local11 = new Class11_Sub2(this.aClass43_72, arg0);
				if (local26 != null) {
					local11.method1199(new Class3_Sub41(local26));
				}
				this.aClass161_12.method23222(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ajx", name = "c", descriptor = "(I)Lclient!cy;", line = 22)
	@Override
	public Class11 method14720(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_12;
		synchronized (this.aClass161_12) {
			@Pc(11) Class11_Sub2 local11 = (Class11_Sub2) this.aClass161_12.method23219((long) arg0);
			if (local11 == null) {
				@Pc(26) byte[] local26 = this.aClass359_24.method26713(this.aClass43_72.method9491().anInt3631 * -1739932335, arg0);
				local11 = new Class11_Sub2(this.aClass43_72, arg0);
				if (local26 != null) {
					local11.method1199(new Class3_Sub41(local26));
				}
				this.aClass161_12.method23222(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ajx", name = "b", descriptor = "(I)Lclient!cy;", line = 22)
	@Override
	public Class11 method14719(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_12;
		synchronized (this.aClass161_12) {
			@Pc(11) Class11_Sub2 local11 = (Class11_Sub2) this.aClass161_12.method23219((long) arg0);
			if (local11 == null) {
				@Pc(26) byte[] local26 = this.aClass359_24.method26713(this.aClass43_72.method9491().anInt3631 * -1739932335, arg0);
				local11 = new Class11_Sub2(this.aClass43_72, arg0);
				if (local26 != null) {
					local11.method1199(new Class3_Sub41(local26));
				}
				this.aClass161_12.method23222(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ajx", name = "i", descriptor = "(I)V", line = 35)
	public void method14736() {
		@Pc(3) Class161 local3 = this.aClass161_12;
		synchronized (this.aClass161_12) {
			this.aClass161_12.method23224();
		}
	}

	@OriginalMember(owner = "client!ajx", name = "at", descriptor = "(I)V", line = 41)
	public void method14735(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_12;
		synchronized (this.aClass161_12) {
			this.aClass161_12.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ajx", name = "f", descriptor = "(II)V", line = 41)
	public void method14738(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_12;
		synchronized (this.aClass161_12) {
			this.aClass161_12.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ajx", name = "k", descriptor = "(I)V", line = 47)
	public void method14737() {
		@Pc(3) Class161 local3 = this.aClass161_12;
		synchronized (this.aClass161_12) {
			this.aClass161_12.method23245();
		}
	}

	@OriginalMember(owner = "client!ajx", name = "af", descriptor = "()V", line = 47)
	public void method14739() {
		@Pc(3) Class161 local3 = this.aClass161_12;
		synchronized (this.aClass161_12) {
			this.aClass161_12.method23245();
		}
	}

	@OriginalMember(owner = "client!ajx", name = "by", descriptor = "(II)Z", line = 1444)
	static boolean method14741(@OriginalArg(0) int arg0) {
		if (arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6 || arg0 == 1001 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 2;
		}
	}

	@OriginalMember(owner = "client!ajx", name = "afc", descriptor = "(Lclient!vs;I)V", line = 9877)
	static final void method14740(@OriginalArg(0) Class536 arg0) {
		throw new RuntimeException("");
	}
}
