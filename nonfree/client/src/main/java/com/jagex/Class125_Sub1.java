package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aic")
public class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!aic", name = "p", descriptor = "J")
	long aLong44 = 0L;

	@OriginalMember(owner = "client!aic", name = "c", descriptor = "J")
	long aLong46 = 0L;

	@OriginalMember(owner = "client!aic", name = "v", descriptor = "J")
	long aLong45 = 0L;

	@OriginalMember(owner = "client!aic", name = "l", descriptor = "[J")
	long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!aic", name = "y", descriptor = "I")
	int anInt1292 = 0;

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "I")
	int anInt1293 = -1377951317;

	@OriginalMember(owner = "client!aic", name = "<init>", descriptor = "()V", line = 15)
	Class125_Sub1() {
		this.aLong46 = (this.aLong44 = QueryPerformanceCounter.nanoTime() * -8396852095198586839L) * -3373600579297368151L;
		if (this.aLong44 * 4878586447268643865L == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aic", name = "t", descriptor = "()V", line = 21)
	@Override
	void method12690() {
		this.aLong45 = 0L;
		if (this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L) {
			this.aLong44 += this.aLong46 * -6834620542787523431L - this.aLong44;
		}
	}

	@OriginalMember(owner = "client!aic", name = "v", descriptor = "(I)V", line = 21)
	@Override
	void method12687() {
		this.aLong45 = 0L;
		if (this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L) {
			this.aLong44 += this.aLong46 * -6834620542787523431L - this.aLong44;
		}
	}

	@OriginalMember(owner = "client!aic", name = "s", descriptor = "()J", line = 26)
	@Override
	long method12691() {
		this.aLong44 += this.method11544() * -8396852095198586839L;
		return this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L ? (this.aLong46 * -5232400543391940879L - this.aLong44 * 4878586447268643865L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aic", name = "l", descriptor = "(I)J", line = 26)
	@Override
	long method12688() {
		this.aLong44 += this.method11544() * -8396852095198586839L;
		return this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L ? (this.aLong46 * -5232400543391940879L - this.aLong44 * 4878586447268643865L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aic", name = "d", descriptor = "()J", line = 26)
	@Override
	long method12693() {
		this.aLong44 += this.method11544() * -8396852095198586839L;
		return this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L ? (this.aLong46 * -5232400543391940879L - this.aLong44 * 4878586447268643865L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aic", name = "q", descriptor = "()J", line = 26)
	@Override
	long method12689() {
		this.aLong44 += this.method11544() * -8396852095198586839L;
		return this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L ? (this.aLong46 * -5232400543391940879L - this.aLong44 * 4878586447268643865L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aic", name = "x", descriptor = "()J", line = 26)
	@Override
	long method12692() {
		this.aLong44 += this.method11544() * -8396852095198586839L;
		return this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L ? (this.aLong46 * -5232400543391940879L - this.aLong44 * 4878586447268643865L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aic", name = "g", descriptor = "(J)I", line = 34)
	@Override
	int method12686(@OriginalArg(0) long arg0) {
		if (this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L) {
			this.aLong45 += this.aLong46 * 6047529913974516993L - this.aLong44 * -6892798999334740823L;
			this.aLong44 += this.aLong46 * -6834620542787523431L - this.aLong44;
			this.aLong46 += arg0 * 2549510955859259921L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong46 += arg0 * 2549510955859259921L;
		} while (local49 < 10 && this.aLong46 * -5232400543391940879L < this.aLong44 * 4878586447268643865L);
		if (this.aLong46 * -5232400543391940879L < this.aLong44 * 4878586447268643865L) {
			this.aLong46 = this.aLong44 * -3373600579297368151L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aic", name = "r", descriptor = "(J)I", line = 34)
	@Override
	int method12694(@OriginalArg(0) long arg0) {
		if (this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L) {
			this.aLong45 += this.aLong46 * 6047529913974516993L - this.aLong44 * -6892798999334740823L;
			this.aLong44 += this.aLong46 * -6834620542787523431L - this.aLong44;
			this.aLong46 += arg0 * 2549510955859259921L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong46 += arg0 * 2549510955859259921L;
		} while (local49 < 10 && this.aLong46 * -5232400543391940879L < this.aLong44 * 4878586447268643865L);
		if (this.aLong46 * -5232400543391940879L < this.aLong44 * 4878586447268643865L) {
			this.aLong46 = this.aLong44 * -3373600579297368151L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aic", name = "y", descriptor = "(J)I", line = 34)
	@Override
	int method12700(@OriginalArg(0) long arg0) {
		if (this.aLong46 * -5232400543391940879L > this.aLong44 * 4878586447268643865L) {
			this.aLong45 += this.aLong46 * 6047529913974516993L - this.aLong44 * -6892798999334740823L;
			this.aLong44 += this.aLong46 * -6834620542787523431L - this.aLong44;
			this.aLong46 += arg0 * 2549510955859259921L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong46 += arg0 * 2549510955859259921L;
		} while (local49 < 10 && this.aLong46 * -5232400543391940879L < this.aLong44 * 4878586447268643865L);
		if (this.aLong46 * -5232400543391940879L < this.aLong44 * 4878586447268643865L) {
			this.aLong46 = this.aLong44 * -3373600579297368151L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aic", name = "z", descriptor = "()J", line = 52)
	@Override
	long method12695() {
		return this.aLong44 * 4878586447268643865L;
	}

	@OriginalMember(owner = "client!aic", name = "i", descriptor = "()J", line = 52)
	@Override
	long method12697() {
		return this.aLong44 * 4878586447268643865L;
	}

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "(I)J", line = 52)
	@Override
	long method12699() {
		return this.aLong44 * 4878586447268643865L;
	}

	@OriginalMember(owner = "client!aic", name = "j", descriptor = "()J", line = 52)
	@Override
	long method12696() {
		return this.aLong44 * 4878586447268643865L;
	}

	@OriginalMember(owner = "client!aic", name = "k", descriptor = "()J", line = 52)
	@Override
	long method12698() {
		return this.aLong44 * 4878586447268643865L;
	}

	@OriginalMember(owner = "client!aic", name = "u", descriptor = "()J", line = 52)
	@Override
	long method12701() {
		return this.aLong44 * 4878586447268643865L;
	}

	@OriginalMember(owner = "client!aic", name = "m", descriptor = "(I)J", line = 56)
	long method11544() {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong45 * 3273066997404197361L;
		this.aLong45 = local1 * -3069990554298355951L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray10[this.anInt1292 * 1068011795] = local8;
			this.anInt1292 = (this.anInt1292 * 1068011795 + 1) % 10 * 1699602715;
			if (this.anInt1293 * 263966979 < 1) {
				this.anInt1293 += -1377951317;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1293 * 263966979; local57++) {
			local55 += this.aLongArray10[(this.anInt1292 * 1068011795 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1293 * 263966979);
	}
}
