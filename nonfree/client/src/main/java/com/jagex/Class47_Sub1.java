package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aej")
public class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!aej", name = "p", descriptor = "J")
	long aLong30 = 0L;

	@OriginalMember(owner = "client!aej", name = "a", descriptor = "J")
	long aLong28 = 0L;

	@OriginalMember(owner = "client!aej", name = "g", descriptor = "J")
	long aLong29 = 0L;

	@OriginalMember(owner = "client!aej", name = "l", descriptor = "[J")
	long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!aej", name = "h", descriptor = "I")
	int anInt972 = 0;

	@OriginalMember(owner = "client!aej", name = "x", descriptor = "I")
	int anInt973 = 1962874713;

	@OriginalMember(owner = "client!aej", name = "<init>", descriptor = "()V", line = 13)
	Class47_Sub1() {
		this.aLong30 = System.nanoTime() * 2933278531255569223L;
		this.aLong28 = System.nanoTime() * -206355534619609773L;
	}

	@OriginalMember(owner = "client!aej", name = "g", descriptor = "(I)V", line = 19)
	@Override
	void method9221() {
		this.aLong29 = 0L;
		if (this.aLong28 * -755410957115844901L > this.aLong30 * -8927829561916281225L) {
			this.aLong30 += this.aLong28 * -3380578652997599299L - this.aLong30;
		}
	}

	@OriginalMember(owner = "client!aej", name = "s", descriptor = "()V", line = 19)
	@Override
	void method9233() {
		this.aLong29 = 0L;
		if (this.aLong28 * -755410957115844901L > this.aLong30 * -8927829561916281225L) {
			this.aLong30 += this.aLong28 * -3380578652997599299L - this.aLong30;
		}
	}

	@OriginalMember(owner = "client!aej", name = "u", descriptor = "()V", line = 19)
	@Override
	void method9225() {
		this.aLong29 = 0L;
		if (this.aLong28 * -755410957115844901L > this.aLong30 * -8927829561916281225L) {
			this.aLong30 += this.aLong28 * -3380578652997599299L - this.aLong30;
		}
	}

	@OriginalMember(owner = "client!aej", name = "l", descriptor = "(I)J", line = 24)
	@Override
	long method9224() {
		this.aLong30 += this.method8798() * 2933278531255569223L;
		return this.aLong28 * -755410957115844901L > this.aLong30 * -8927829561916281225L ? (this.aLong28 * -755410957115844901L - this.aLong30 * -8927829561916281225L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aej", name = "y", descriptor = "()J", line = 24)
	@Override
	long method9229() {
		this.aLong30 += this.method8798() * 2933278531255569223L;
		return this.aLong28 * -755410957115844901L > this.aLong30 * -8927829561916281225L ? (this.aLong28 * -755410957115844901L - this.aLong30 * -8927829561916281225L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aej", name = "b", descriptor = "(J)I", line = 32)
	@Override
	int method9230(@OriginalArg(0) long arg0) {
		if (this.aLong28 * -755410957115844901L > this.aLong30 * -8927829561916281225L) {
			this.aLong29 += this.aLong28 * 3979923072478237481L - this.aLong30 * 9178247265568674269L;
			this.aLong30 += this.aLong28 * -3380578652997599299L - this.aLong30;
			this.aLong28 += arg0 * -206355534619609773L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong28 += arg0 * -206355534619609773L;
		} while (local49 < 10 && this.aLong28 * -755410957115844901L < this.aLong30 * -8927829561916281225L);
		if (this.aLong28 * -755410957115844901L < this.aLong30 * -8927829561916281225L) {
			this.aLong28 = this.aLong30 * -9155615855557053547L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aej", name = "h", descriptor = "(J)I", line = 32)
	@Override
	int method9223(@OriginalArg(0) long arg0) {
		if (this.aLong28 * -755410957115844901L > this.aLong30 * -8927829561916281225L) {
			this.aLong29 += this.aLong28 * 3979923072478237481L - this.aLong30 * 9178247265568674269L;
			this.aLong30 += this.aLong28 * -3380578652997599299L - this.aLong30;
			this.aLong28 += arg0 * -206355534619609773L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong28 += arg0 * -206355534619609773L;
		} while (local49 < 10 && this.aLong28 * -755410957115844901L < this.aLong30 * -8927829561916281225L);
		if (this.aLong28 * -755410957115844901L < this.aLong30 * -8927829561916281225L) {
			this.aLong28 = this.aLong30 * -9155615855557053547L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aej", name = "z", descriptor = "()J", line = 50)
	@Override
	long method9232() {
		return this.aLong30 * -8927829561916281225L;
	}

	@OriginalMember(owner = "client!aej", name = "x", descriptor = "(S)J", line = 50)
	@Override
	long method9226() {
		return this.aLong30 * -8927829561916281225L;
	}

	@OriginalMember(owner = "client!aej", name = "c", descriptor = "()J", line = 50)
	@Override
	long method9234() {
		return this.aLong30 * -8927829561916281225L;
	}

	@OriginalMember(owner = "client!aej", name = "q", descriptor = "(I)J", line = 54)
	long method8798() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong29 * -3420926883556868509L;
		this.aLong29 = local1 * -2182042313959787701L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray3[this.anInt972 * 345470151] = local8;
			this.anInt972 = (this.anInt972 * 345470151 + 1) % 10 * -713880329;
			if (this.anInt973 * -1950760727 < 1) {
				this.anInt973 += 1962874713;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt973 * -1950760727; local57++) {
			local55 += this.aLongArray3[(this.anInt972 * 345470151 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt973 * -1950760727);
	}

	@OriginalMember(owner = "client!aej", name = "m", descriptor = "()J", line = 54)
	long method8799() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong29 * -3420926883556868509L;
		this.aLong29 = local1 * -2182042313959787701L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray3[this.anInt972 * 345470151] = local8;
			this.anInt972 = (this.anInt972 * 345470151 + 1) % 10 * -713880329;
			if (this.anInt973 * -1950760727 < 1) {
				this.anInt973 += 1962874713;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt973 * -1950760727; local57++) {
			local55 += this.aLongArray3[(this.anInt972 * 345470151 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt973 * -1950760727);
	}

	@OriginalMember(owner = "client!aej", name = "v", descriptor = "()J", line = 54)
	long method8800() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong29 * -3420926883556868509L;
		this.aLong29 = local1 * -2182042313959787701L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray3[this.anInt972 * 345470151] = local8;
			this.anInt972 = (this.anInt972 * 345470151 + 1) % 10 * -713880329;
			if (this.anInt973 * -1950760727 < 1) {
				this.anInt973 += 1962874713;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt973 * -1950760727; local57++) {
			local55 += this.aLongArray3[(this.anInt972 * 345470151 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt973 * -1950760727);
	}

	@OriginalMember(owner = "client!aej", name = "fb", descriptor = "(I)V", line = 2067)
	static void method8801() {
		if (Class613.aClass21_13 == null) {
			return;
		}
		client.aClass370_1.method26962();
		Class157.method23191();
		Class578.method33182();
		Class3_Sub40.method19105();
		client.aClass370_1.method26938();
		Class369.method26933();
		Class3_Sub35_Sub1.method18870();
		Class604.method33534(false);
		Class423.method27883();
		Class314.method25828();
		Class155.method23173();
		@Pc(28) int local28;
		for (local28 = 0; local28 < client.aClass398Array1.length; local28++) {
			if (client.aClass398Array1[local28] != null) {
				client.aClass398Array1[local28].aClass20_8 = null;
			}
		}
		@Pc(57) int local57;
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(52) Class26_Sub1_Sub1_Sub1_Sub2 local52 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local52 != null) {
				for (local57 = 0; local57 < local52.aClass20Array3.length; local57++) {
					local52.aClass20Array3[local57] = null;
				}
			}
		}
		for (local28 = 0; local28 < client.anInt3054 * -453205259; local28++) {
			@Pc(84) Class26_Sub1_Sub1_Sub1_Sub1 local84 = (Class26_Sub1_Sub1_Sub1_Sub1) client.aClass3_Sub29Array1[local28].anObject2;
			if (local84 != null) {
				for (local57 = 0; local57 < local84.aClass20Array3.length; local57++) {
					local84.aClass20Array3[local57] = null;
				}
			}
		}
		client.aClass581_18.method33222();
		Class613.aClass21_13.method17020();
		Class613.aClass21_13 = null;
	}
}
