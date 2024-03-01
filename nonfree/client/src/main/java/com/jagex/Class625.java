package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zo")
public class Class625 {

	@OriginalMember(owner = "client!zo", name = "z", descriptor = "S")
	static short aShort181;

	@OriginalMember(owner = "client!zo", name = "qw", descriptor = "I")
	static int anInt5577;

	@OriginalMember(owner = "client!zo", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_74 = new Class161(64);

	@OriginalMember(owner = "client!zo", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_118;

	@OriginalMember(owner = "client!zo", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 14)
	public Class625(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_118 = arg2;
		if (this.aClass359_118 != null) {
			this.aClass359_118.method26682(Class185.aClass185_41.anInt3631 * -1739932335);
		}
	}

	@OriginalMember(owner = "client!zo", name = "p", descriptor = "(II)Lclient!zt;", line = 24)
	public Class630 method33783(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_74;
		@Pc(11) Class630 local11;
		synchronized (this.aClass161_74) {
			local11 = (Class630) this.aClass161_74.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_118;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_118) {
			local39 = this.aClass359_118.method26713(Class185.aClass185_41.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class630();
		if (local39 != null) {
			local11.method33849(new Class3_Sub41(local39));
		}
		@Pc(65) Class161 local65 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!zo", name = "h", descriptor = "()V", line = 41)
	public void method33787() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23224();
		}
	}

	@OriginalMember(owner = "client!zo", name = "a", descriptor = "(I)V", line = 41)
	public void method33788() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23224();
		}
	}

	@OriginalMember(owner = "client!zo", name = "s", descriptor = "()V", line = 41)
	public void method33789() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23224();
		}
	}

	@OriginalMember(owner = "client!zo", name = "x", descriptor = "()V", line = 41)
	public void method33792() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23224();
		}
	}

	@OriginalMember(owner = "client!zo", name = "g", descriptor = "(II)V", line = 47)
	public void method33785(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zo", name = "u", descriptor = "(I)V", line = 47)
	public void method33790(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zo", name = "y", descriptor = "(I)V", line = 47)
	public void method33791(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zo", name = "c", descriptor = "()V", line = 53)
	public void method33784() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23245();
		}
	}

	@OriginalMember(owner = "client!zo", name = "l", descriptor = "(B)V", line = 53)
	public void method33786() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23245();
		}
	}

	@OriginalMember(owner = "client!zo", name = "b", descriptor = "()V", line = 53)
	public void method33793() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23245();
		}
	}

	@OriginalMember(owner = "client!zo", name = "z", descriptor = "()V", line = 53)
	public void method33794() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23245();
		}
	}

	@OriginalMember(owner = "client!zo", name = "j", descriptor = "()V", line = 53)
	public void method33795() {
		@Pc(3) Class161 local3 = this.aClass161_74;
		synchronized (this.aClass161_74) {
			this.aClass161_74.method23245();
		}
	}

	@OriginalMember(owner = "client!zo", name = "il", descriptor = "(I)V", line = 4555)
	static final void method33796() {
		@Pc(1) int local1 = 0;
		@Pc(5) Class438 local5 = client.aClass370_1.method26950();
		for (@Pc(7) int local7 = 0; local7 < client.aClass370_1.method26943(); local7++) {
			for (@Pc(14) int local14 = 0; local14 < client.aClass370_1.method27062(); local14++) {
				if (Class43_Sub1.method8380(local5.aClass432ArrayArrayArray3, local1, local7, local14, true)) {
					local1++;
				}
				if (local1 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zo", name = "akj", descriptor = "(Lclient!vs;B)V", line = 11016)
	static final void method33797(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(24) float local24 = Class317.method25842(arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]);
		@Pc(29) Class3_Sub1_Sub2 local29 = Class80.aClass23_Sub1_1.method5897(local13);
		if (local29 == null) {
			throw new RuntimeException("");
		} else if (local29 instanceof Class3_Sub1_Sub2_Sub2) {
			((Class3_Sub1_Sub2_Sub2) local29).method21215(local24);
		} else {
			throw new RuntimeException("");
		}
	}
}
