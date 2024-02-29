package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiq")
public class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!aiq", name = "p", descriptor = "J")
	long aLong53 = 0L;

	@OriginalMember(owner = "client!aiq", name = "c", descriptor = "J")
	long aLong55 = 0L;

	@OriginalMember(owner = "client!aiq", name = "v", descriptor = "J")
	long aLong54 = 0L;

	@OriginalMember(owner = "client!aiq", name = "l", descriptor = "[J")
	long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!aiq", name = "y", descriptor = "I")
	int anInt1423 = 0;

	@OriginalMember(owner = "client!aiq", name = "w", descriptor = "I")
	int anInt1424 = 1753126853;

	@OriginalMember(owner = "client!aiq", name = "<init>", descriptor = "()V", line = 13)
	Class125_Sub2() {
		this.aLong53 = System.nanoTime() * -6277576690521412679L;
		this.aLong55 = System.nanoTime() * -3136186946630862197L;
	}

	@OriginalMember(owner = "client!aiq", name = "v", descriptor = "(I)V", line = 19)
	@Override
	void method12687() {
		this.aLong54 = 0L;
		if (this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L) {
			this.aLong53 += this.aLong55 * 4749623441952698187L - this.aLong53;
		}
	}

	@OriginalMember(owner = "client!aiq", name = "t", descriptor = "()V", line = 19)
	@Override
	void method12690() {
		this.aLong54 = 0L;
		if (this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L) {
			this.aLong53 += this.aLong55 * 4749623441952698187L - this.aLong53;
		}
	}

	@OriginalMember(owner = "client!aiq", name = "q", descriptor = "()J", line = 24)
	@Override
	long method12689() {
		this.aLong53 += this.method12703() * -6277576690521412679L;
		return this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L ? (this.aLong55 * 5700793523570564387L - this.aLong53 * -3744195550137832823L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aiq", name = "x", descriptor = "()J", line = 24)
	@Override
	long method12692() {
		this.aLong53 += this.method12703() * -6277576690521412679L;
		return this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L ? (this.aLong55 * 5700793523570564387L - this.aLong53 * -3744195550137832823L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aiq", name = "s", descriptor = "()J", line = 24)
	@Override
	long method12691() {
		this.aLong53 += this.method12703() * -6277576690521412679L;
		return this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L ? (this.aLong55 * 5700793523570564387L - this.aLong53 * -3744195550137832823L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aiq", name = "d", descriptor = "()J", line = 24)
	@Override
	long method12693() {
		this.aLong53 += this.method12703() * -6277576690521412679L;
		return this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L ? (this.aLong55 * 5700793523570564387L - this.aLong53 * -3744195550137832823L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aiq", name = "l", descriptor = "(I)J", line = 24)
	@Override
	long method12688() {
		this.aLong53 += this.method12703() * -6277576690521412679L;
		return this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L ? (this.aLong55 * 5700793523570564387L - this.aLong53 * -3744195550137832823L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aiq", name = "y", descriptor = "(J)I", line = 32)
	@Override
	int method12700(@OriginalArg(0) long arg0) {
		if (this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L) {
			this.aLong54 += this.aLong55 * -3571938639842052431L - this.aLong53 * 5303944491593689203L;
			this.aLong53 += this.aLong55 * 4749623441952698187L - this.aLong53;
			this.aLong55 += arg0 * -3136186946630862197L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong55 += arg0 * -3136186946630862197L;
		} while (local49 < 10 && this.aLong55 * 5700793523570564387L < this.aLong53 * -3744195550137832823L);
		if (this.aLong55 * 5700793523570564387L < this.aLong53 * -3744195550137832823L) {
			this.aLong55 = this.aLong53 * 8728455264336487011L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aiq", name = "r", descriptor = "(J)I", line = 32)
	@Override
	int method12694(@OriginalArg(0) long arg0) {
		if (this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L) {
			this.aLong54 += this.aLong55 * -3571938639842052431L - this.aLong53 * 5303944491593689203L;
			this.aLong53 += this.aLong55 * 4749623441952698187L - this.aLong53;
			this.aLong55 += arg0 * -3136186946630862197L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong55 += arg0 * -3136186946630862197L;
		} while (local49 < 10 && this.aLong55 * 5700793523570564387L < this.aLong53 * -3744195550137832823L);
		if (this.aLong55 * 5700793523570564387L < this.aLong53 * -3744195550137832823L) {
			this.aLong55 = this.aLong53 * 8728455264336487011L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aiq", name = "g", descriptor = "(J)I", line = 32)
	@Override
	int method12686(@OriginalArg(0) long arg0) {
		if (this.aLong55 * 5700793523570564387L > this.aLong53 * -3744195550137832823L) {
			this.aLong54 += this.aLong55 * -3571938639842052431L - this.aLong53 * 5303944491593689203L;
			this.aLong53 += this.aLong55 * 4749623441952698187L - this.aLong53;
			this.aLong55 += arg0 * -3136186946630862197L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong55 += arg0 * -3136186946630862197L;
		} while (local49 < 10 && this.aLong55 * 5700793523570564387L < this.aLong53 * -3744195550137832823L);
		if (this.aLong55 * 5700793523570564387L < this.aLong53 * -3744195550137832823L) {
			this.aLong55 = this.aLong53 * 8728455264336487011L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aiq", name = "j", descriptor = "()J", line = 50)
	@Override
	long method12696() {
		return this.aLong53 * -3744195550137832823L;
	}

	@OriginalMember(owner = "client!aiq", name = "w", descriptor = "(I)J", line = 50)
	@Override
	long method12699() {
		return this.aLong53 * -3744195550137832823L;
	}

	@OriginalMember(owner = "client!aiq", name = "z", descriptor = "()J", line = 50)
	@Override
	long method12695() {
		return this.aLong53 * -3744195550137832823L;
	}

	@OriginalMember(owner = "client!aiq", name = "k", descriptor = "()J", line = 50)
	@Override
	long method12698() {
		return this.aLong53 * -3744195550137832823L;
	}

	@OriginalMember(owner = "client!aiq", name = "i", descriptor = "()J", line = 50)
	@Override
	long method12697() {
		return this.aLong53 * -3744195550137832823L;
	}

	@OriginalMember(owner = "client!aiq", name = "u", descriptor = "()J", line = 50)
	@Override
	long method12701() {
		return this.aLong53 * -3744195550137832823L;
	}

	@OriginalMember(owner = "client!aiq", name = "aj", descriptor = "()J", line = 54)
	long method12702() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong54 * 7085173481284529683L;
		this.aLong54 = local1 * 6978492438888549403L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1423 * 1927387759] = local8;
			this.anInt1423 = (this.anInt1423 * 1927387759 + 1) % 10 * -1744894833;
			if (this.anInt1424 * -1793929459 < 1) {
				this.anInt1424 += 1753126853;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1424 * -1793929459; local57++) {
			local55 += this.aLongArray11[(this.anInt1423 * 1927387759 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1424 * -1793929459);
	}

	@OriginalMember(owner = "client!aiq", name = "m", descriptor = "(I)J", line = 54)
	long method12703() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong54 * 7085173481284529683L;
		this.aLong54 = local1 * 6978492438888549403L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1423 * 1927387759] = local8;
			this.anInt1423 = (this.anInt1423 * 1927387759 + 1) % 10 * -1744894833;
			if (this.anInt1424 * -1793929459 < 1) {
				this.anInt1424 += 1753126853;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1424 * -1793929459; local57++) {
			local55 += this.aLongArray11[(this.anInt1423 * 1927387759 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1424 * -1793929459);
	}

	@OriginalMember(owner = "client!aiq", name = "h", descriptor = "()J", line = 54)
	long method12704() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong54 * 7085173481284529683L;
		this.aLong54 = local1 * 6978492438888549403L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1423 * 1927387759] = local8;
			this.anInt1423 = (this.anInt1423 * 1927387759 + 1) % 10 * -1744894833;
			if (this.anInt1424 * -1793929459 < 1) {
				this.anInt1424 += 1753126853;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1424 * -1793929459; local57++) {
			local55 += this.aLongArray11[(this.anInt1423 * 1927387759 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1424 * -1793929459);
	}

	@OriginalMember(owner = "client!aiq", name = "v", descriptor = "(BI)C", line = 61)
	public static char method12705(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = Class680.aCharArray8[local3 - 128];
			if (local31 == '\u0000') {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!aiq", name = "ef", descriptor = "(B)Lclient!akg;", line = 937)
	public static Class77_Sub30 method12706() {
		if (Class136_Sub1.aClass695_23 == null || Class136_Sub1.aClass704_1 == null) {
			return null;
		}
		Class136_Sub1.aClass704_1.method36545(Class136_Sub1.aClass695_23);
		@Pc(16) Class77_Sub30 local16 = (Class77_Sub30) Class136_Sub1.aClass704_1.method36551();
		if (local16 == null) {
			return null;
		} else {
			@Pc(30) Class302 local30 = (Class302) Class136_Sub1.aClass35_Sub10_2.method18319(local16.anInt1635 * 1592054281);
			return local30 != null && local30.aBoolean692 && local30.method27136(Class136_Sub1.anInterface17_2, Class136_Sub1.anInterface19_2) ? local16 : Class109_Sub1.method9096();
		}
	}

	@OriginalMember(owner = "client!aiq", name = "sy", descriptor = "(Lclient!yf;S)V", line = 7802)
	static final void method12707(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3873 * -612037017;
	}
}
