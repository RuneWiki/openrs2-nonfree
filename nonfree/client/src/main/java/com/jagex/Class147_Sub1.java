package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "J")
	long aLong52 = 0L;

	@OriginalMember(owner = "client!aja", name = "n", descriptor = "J")
	long aLong50 = 0L;

	@OriginalMember(owner = "client!aja", name = "m", descriptor = "J")
	long aLong51 = 0L;

	@OriginalMember(owner = "client!aja", name = "k", descriptor = "[J")
	long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
	int anInt1391 = 0;

	@OriginalMember(owner = "client!aja", name = "w", descriptor = "I")
	int anInt1390 = 198320305;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "()V", line = 13)
	Class147_Sub1() {
		this.aLong52 = System.nanoTime() * -3841659173834353623L;
		this.aLong50 = System.nanoTime() * 4910900439810820327L;
	}

	@OriginalMember(owner = "client!aja", name = "m", descriptor = "(B)V", line = 19)
	@Override
	void method12684() {
		this.aLong51 = 0L;
		if (this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L) {
			this.aLong52 += this.aLong50 * -5098392143480895377L - this.aLong52;
		}
	}

	@OriginalMember(owner = "client!aja", name = "l", descriptor = "()V", line = 19)
	@Override
	void method12690() {
		this.aLong51 = 0L;
		if (this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L) {
			this.aLong52 += this.aLong50 * -5098392143480895377L - this.aLong52;
		}
	}

	@OriginalMember(owner = "client!aja", name = "k", descriptor = "(I)J", line = 24)
	@Override
	long method12687() {
		this.aLong52 += this.method11755() * -3841659173834353623L;
		return this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L ? (this.aLong50 * 2223827046660623063L - this.aLong52 * -2599119241432315879L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aja", name = "u", descriptor = "()J", line = 24)
	@Override
	long method12691() {
		this.aLong52 += this.method11755() * -3841659173834353623L;
		return this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L ? (this.aLong50 * 2223827046660623063L - this.aLong52 * -2599119241432315879L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "(J)I", line = 32)
	@Override
	int method12688(@OriginalArg(0) long arg0) {
		if (this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L) {
			this.aLong51 += this.aLong50 * 5480564789751713699L - this.aLong52 * 4293574849750908429L;
			this.aLong52 += this.aLong50 * -5098392143480895377L - this.aLong52;
			this.aLong50 += arg0 * 4910900439810820327L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong50 += arg0 * 4910900439810820327L;
		} while (local49 < 10 && this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L);
		if (this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L) {
			this.aLong50 = this.aLong52 * 8326369379281573519L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aja", name = "p", descriptor = "(J)I", line = 32)
	@Override
	int method12693(@OriginalArg(0) long arg0) {
		if (this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L) {
			this.aLong51 += this.aLong50 * 5480564789751713699L - this.aLong52 * 4293574849750908429L;
			this.aLong52 += this.aLong50 * -5098392143480895377L - this.aLong52;
			this.aLong50 += arg0 * 4910900439810820327L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong50 += arg0 * 4910900439810820327L;
		} while (local49 < 10 && this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L);
		if (this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L) {
			this.aLong50 = this.aLong52 * 8326369379281573519L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aja", name = "z", descriptor = "(J)I", line = 32)
	@Override
	int method12692(@OriginalArg(0) long arg0) {
		if (this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L) {
			this.aLong51 += this.aLong50 * 5480564789751713699L - this.aLong52 * 4293574849750908429L;
			this.aLong52 += this.aLong50 * -5098392143480895377L - this.aLong52;
			this.aLong50 += arg0 * 4910900439810820327L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong50 += arg0 * 4910900439810820327L;
		} while (local49 < 10 && this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L);
		if (this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L) {
			this.aLong50 = this.aLong52 * 8326369379281573519L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "(J)I", line = 32)
	@Override
	int method12695(@OriginalArg(0) long arg0) {
		if (this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L) {
			this.aLong51 += this.aLong50 * 5480564789751713699L - this.aLong52 * 4293574849750908429L;
			this.aLong52 += this.aLong50 * -5098392143480895377L - this.aLong52;
			this.aLong50 += arg0 * 4910900439810820327L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong50 += arg0 * 4910900439810820327L;
		} while (local49 < 10 && this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L);
		if (this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L) {
			this.aLong50 = this.aLong52 * 8326369379281573519L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "(J)I", line = 32)
	@Override
	int method12698(@OriginalArg(0) long arg0) {
		if (this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L) {
			this.aLong51 += this.aLong50 * 5480564789751713699L - this.aLong52 * 4293574849750908429L;
			this.aLong52 += this.aLong50 * -5098392143480895377L - this.aLong52;
			this.aLong50 += arg0 * 4910900439810820327L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong50 += arg0 * 4910900439810820327L;
		} while (local49 < 10 && this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L);
		if (this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L) {
			this.aLong50 = this.aLong52 * 8326369379281573519L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "(J)I", line = 32)
	@Override
	int method12694(@OriginalArg(0) long arg0) {
		if (this.aLong50 * 2223827046660623063L > this.aLong52 * -2599119241432315879L) {
			this.aLong51 += this.aLong50 * 5480564789751713699L - this.aLong52 * 4293574849750908429L;
			this.aLong52 += this.aLong50 * -5098392143480895377L - this.aLong52;
			this.aLong50 += arg0 * 4910900439810820327L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong50 += arg0 * 4910900439810820327L;
		} while (local49 < 10 && this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L);
		if (this.aLong50 * 2223827046660623063L < this.aLong52 * -2599119241432315879L) {
			this.aLong50 = this.aLong52 * 8326369379281573519L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aja", name = "o", descriptor = "()J", line = 50)
	@Override
	long method12696() {
		return this.aLong52 * -2599119241432315879L;
	}

	@OriginalMember(owner = "client!aja", name = "w", descriptor = "(I)J", line = 50)
	@Override
	long method12701() {
		return this.aLong52 * -2599119241432315879L;
	}

	@OriginalMember(owner = "client!aja", name = "v", descriptor = "()J", line = 50)
	@Override
	long method12697() {
		return this.aLong52 * -2599119241432315879L;
	}

	@OriginalMember(owner = "client!aja", name = "s", descriptor = "()J", line = 50)
	@Override
	long method12699() {
		return this.aLong52 * -2599119241432315879L;
	}

	@OriginalMember(owner = "client!aja", name = "y", descriptor = "()J", line = 50)
	@Override
	long method12700() {
		return this.aLong52 * -2599119241432315879L;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "()J", line = 54)
	long method11754() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong51 * -4691255181317653699L;
		this.aLong51 = local1 * -8012413606731942891L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray10[this.anInt1391 * 636490669] = local8;
			this.anInt1391 = (this.anInt1391 * 636490669 + 1) % 10 * 1449576485;
			if (this.anInt1390 * -571987887 < 1) {
				this.anInt1390 += 198320305;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1390 * -571987887; local57++) {
			local55 += this.aLongArray10[(this.anInt1391 * 636490669 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1390 * -571987887);
	}

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "(I)J", line = 54)
	long method11755() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong51 * -4691255181317653699L;
		this.aLong51 = local1 * -8012413606731942891L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray10[this.anInt1391 * 636490669] = local8;
			this.anInt1391 = (this.anInt1391 * 636490669 + 1) % 10 * 1449576485;
			if (this.anInt1390 * -571987887 < 1) {
				this.anInt1390 += 198320305;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1390 * -571987887; local57++) {
			local55 += this.aLongArray10[(this.anInt1391 * 636490669 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1390 * -571987887);
	}

	@OriginalMember(owner = "client!aja", name = "alq", descriptor = "(Lclient!yf;B)V", line = 11911)
	static final void method11756(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5888 -= 1915061582;
		Class480.method29748((String) arg0.anObjectArray45[arg0.anInt5888 * 587908375], (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 1], "", arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1, false);
	}
}
