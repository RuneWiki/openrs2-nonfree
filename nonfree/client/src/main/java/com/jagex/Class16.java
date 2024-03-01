package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aan")
public final class Class16 implements Iterable {

	@OriginalMember(owner = "client!aan", name = "m", descriptor = "J")
	long aLong1;

	@OriginalMember(owner = "client!aan", name = "f", descriptor = "Lclient!tj;")
	Class93 aClass93_3;

	@OriginalMember(owner = "client!aan", name = "k", descriptor = "Lclient!tj;")
	Class93 aClass93_4;

	@OriginalMember(owner = "client!aan", name = "w", descriptor = "I")
	int anInt57 = 0;

	@OriginalMember(owner = "client!aan", name = "e", descriptor = "I")
	int anInt58;

	@OriginalMember(owner = "client!aan", name = "n", descriptor = "[Lclient!tj;")
	Class93[] aClass93Array1;

	@OriginalMember(owner = "client!aan", name = "<init>", descriptor = "(I)V", line = 14)
	public Class16(@OriginalArg(0) int arg0) {
		this.anInt58 = arg0 * -1135808337;
		this.aClass93Array1 = new Class93[arg0];
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			@Pc(27) Class93 local27 = this.aClass93Array1[local15] = new Class93();
			local27.aClass93_227 = local27;
			local27.aClass93_228 = local27;
		}
	}

	@OriginalMember(owner = "client!aan", name = "e", descriptor = "(J)Lclient!tj;", line = 25)
	public Class93 method215(@OriginalArg(0) long arg0) {
		this.aLong1 = arg0 * 5766718150268486631L;
		@Pc(18) Class93 local18 = this.aClass93Array1[(int) (arg0 & (long) (this.anInt58 * 1214539343 - 1))];
		for (this.aClass93_4 = local18.aClass93_227; this.aClass93_4 != local18; this.aClass93_4 = this.aClass93_4.aClass93_227) {
			if (this.aClass93_4.aLong232 * -3750704643647536275L == arg0) {
				@Pc(37) Class93 local37 = this.aClass93_4;
				this.aClass93_4 = this.aClass93_4.aClass93_227;
				return local37;
			}
		}
		this.aClass93_4 = null;
		return null;
	}

	@OriginalMember(owner = "client!aan", name = "z", descriptor = "(J)Lclient!tj;", line = 25)
	public Class93 method226(@OriginalArg(0) long arg0) {
		this.aLong1 = arg0 * 5766718150268486631L;
		@Pc(18) Class93 local18 = this.aClass93Array1[(int) (arg0 & (long) (this.anInt58 * 1214539343 - 1))];
		for (this.aClass93_4 = local18.aClass93_227; this.aClass93_4 != local18; this.aClass93_4 = this.aClass93_4.aClass93_227) {
			if (this.aClass93_4.aLong232 * -3750704643647536275L == arg0) {
				@Pc(37) Class93 local37 = this.aClass93_4;
				this.aClass93_4 = this.aClass93_4.aClass93_227;
				return local37;
			}
		}
		this.aClass93_4 = null;
		return null;
	}

	@OriginalMember(owner = "client!aan", name = "n", descriptor = "(I)Lclient!tj;", line = 41)
	public Class93 method216() {
		if (this.aClass93_4 == null) {
			return null;
		}
		@Pc(21) Class93 local21 = this.aClass93Array1[(int) (this.aLong1 * 7317464477870940119L & (long) (this.anInt58 * 1214539343 - 1))];
		while (this.aClass93_4 != local21) {
			if (this.aLong1 * 7317464477870940119L == this.aClass93_4.aLong232 * -3750704643647536275L) {
				@Pc(39) Class93 local39 = this.aClass93_4;
				this.aClass93_4 = this.aClass93_4.aClass93_227;
				return local39;
			}
			this.aClass93_4 = this.aClass93_4.aClass93_227;
		}
		this.aClass93_4 = null;
		return null;
	}

	@OriginalMember(owner = "client!aan", name = "r", descriptor = "()Lclient!tj;", line = 41)
	public Class93 method233() {
		if (this.aClass93_4 == null) {
			return null;
		}
		@Pc(21) Class93 local21 = this.aClass93Array1[(int) (this.aLong1 * 7317464477870940119L & (long) (this.anInt58 * 1214539343 - 1))];
		while (this.aClass93_4 != local21) {
			if (this.aLong1 * 7317464477870940119L == this.aClass93_4.aLong232 * -3750704643647536275L) {
				@Pc(39) Class93 local39 = this.aClass93_4;
				this.aClass93_4 = this.aClass93_4.aClass93_227;
				return local39;
			}
			this.aClass93_4 = this.aClass93_4.aClass93_227;
		}
		this.aClass93_4 = null;
		return null;
	}

	@OriginalMember(owner = "client!aan", name = "m", descriptor = "([Lclient!tj;B)I", line = 56)
	public int method217(@OriginalArg(0) Class93[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt58 * 1214539343; local3++) {
			@Pc(14) Class93 local14 = this.aClass93Array1[local3];
			for (@Pc(17) Class93 local17 = local14.aClass93_227; local17 != local14; local17 = local17.aClass93_227) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aan", name = "k", descriptor = "(I)I", line = 69)
	public int method218() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt58 * 1214539343; local3++) {
			@Pc(14) Class93 local14 = this.aClass93Array1[local3];
			for (@Pc(17) Class93 local17 = local14.aClass93_227; local17 != local14; local17 = local17.aClass93_227) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aan", name = "f", descriptor = "(Lclient!tj;J)V", line = 82)
	public void method221(@OriginalArg(0) Class93 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		@Pc(20) Class93 local20 = this.aClass93Array1[(int) (arg1 & (long) (this.anInt58 * 1214539343 - 1))];
		arg0.aClass93_228 = local20.aClass93_228;
		arg0.aClass93_227 = local20;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
		arg0.aLong232 = arg1 * -284080703297520027L;
	}

	@OriginalMember(owner = "client!aan", name = "v", descriptor = "(Lclient!tj;J)V", line = 82)
	public void method228(@OriginalArg(0) Class93 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		@Pc(20) Class93 local20 = this.aClass93Array1[(int) (arg1 & (long) (this.anInt58 * 1214539343 - 1))];
		arg0.aClass93_228 = local20.aClass93_228;
		arg0.aClass93_227 = local20;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
		arg0.aLong232 = arg1 * -284080703297520027L;
	}

	@OriginalMember(owner = "client!aan", name = "o", descriptor = "(Lclient!tj;J)V", line = 82)
	public void method229(@OriginalArg(0) Class93 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		@Pc(20) Class93 local20 = this.aClass93Array1[(int) (arg1 & (long) (this.anInt58 * 1214539343 - 1))];
		arg0.aClass93_228 = local20.aClass93_228;
		arg0.aClass93_227 = local20;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
		arg0.aLong232 = arg1 * -284080703297520027L;
	}

	@OriginalMember(owner = "client!aan", name = "s", descriptor = "(Lclient!tj;J)V", line = 82)
	public void method230(@OriginalArg(0) Class93 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		@Pc(20) Class93 local20 = this.aClass93Array1[(int) (arg1 & (long) (this.anInt58 * 1214539343 - 1))];
		arg0.aClass93_228 = local20.aClass93_228;
		arg0.aClass93_227 = local20;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
		arg0.aLong232 = arg1 * -284080703297520027L;
	}

	@OriginalMember(owner = "client!aan", name = "y", descriptor = "(Lclient!tj;J)V", line = 82)
	public void method231(@OriginalArg(0) Class93 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		@Pc(20) Class93 local20 = this.aClass93Array1[(int) (arg1 & (long) (this.anInt58 * 1214539343 - 1))];
		arg0.aClass93_228 = local20.aClass93_228;
		arg0.aClass93_227 = local20;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
		arg0.aLong232 = arg1 * -284080703297520027L;
	}

	@OriginalMember(owner = "client!aan", name = "w", descriptor = "(B)V", line = 92)
	public void method219() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt58 * 1214539343; local1++) {
			@Pc(12) Class93 local12 = this.aClass93Array1[local1];
			while (true) {
				@Pc(15) Class93 local15 = local12.aClass93_227;
				if (local12 == local15) {
					break;
				}
				local15.method23969();
			}
		}
		this.aClass93_4 = null;
		this.aClass93_3 = null;
	}

	@OriginalMember(owner = "client!aan", name = "q", descriptor = "()V", line = 92)
	public void method232() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt58 * 1214539343; local1++) {
			@Pc(12) Class93 local12 = this.aClass93Array1[local1];
			while (true) {
				@Pc(15) Class93 local15 = local12.aClass93_227;
				if (local12 == local15) {
					break;
				}
				local15.method23969();
			}
		}
		this.aClass93_4 = null;
		this.aClass93_3 = null;
	}

	@OriginalMember(owner = "client!aan", name = "l", descriptor = "(B)Lclient!tj;", line = 105)
	public Class93 method220() {
		this.anInt57 = 0;
		return this.method222();
	}

	@OriginalMember(owner = "client!aan", name = "x", descriptor = "()Lclient!tj;", line = 105)
	public Class93 method223() {
		this.anInt57 = 0;
		return this.method222();
	}

	@OriginalMember(owner = "client!aan", name = "u", descriptor = "(I)Lclient!tj;", line = 110)
	public Class93 method222() {
		@Pc(19) Class93 local19;
		if (this.anInt57 * -1449931673 > 0 && this.aClass93_3 != this.aClass93Array1[this.anInt57 * -1449931673 - 1]) {
			local19 = this.aClass93_3;
			this.aClass93_3 = local19.aClass93_227;
			return local19;
		}
		do {
			if (this.anInt57 * -1449931673 >= this.anInt58 * 1214539343) {
				return null;
			}
			local19 = this.aClass93Array1[(this.anInt57 += 1957203799) * -1449931673 - 1].aClass93_227;
		} while (local19 == this.aClass93Array1[this.anInt57 * -1449931673 - 1]);
		this.aClass93_3 = local19.aClass93_227;
		return local19;
	}

	@OriginalMember(owner = "client!aan", name = "b", descriptor = "()Lclient!tj;", line = 110)
	public Class93 method227() {
		@Pc(19) Class93 local19;
		if (this.anInt57 * -1449931673 > 0 && this.aClass93_3 != this.aClass93Array1[this.anInt57 * -1449931673 - 1]) {
			local19 = this.aClass93_3;
			this.aClass93_3 = local19.aClass93_227;
			return local19;
		}
		do {
			if (this.anInt57 * -1449931673 >= this.anInt58 * 1214539343) {
				return null;
			}
			local19 = this.aClass93Array1[(this.anInt57 += 1957203799) * -1449931673 - 1].aClass93_227;
		} while (local19 == this.aClass93Array1[this.anInt57 * -1449931673 - 1]);
		this.aClass93_3 = local19.aClass93_227;
		return local19;
	}

	@OriginalMember(owner = "client!aan", name = "p", descriptor = "()Ljava/util/Iterator;", line = 126)
	public Iterator method214() {
		return new Class10(this);
	}

	@OriginalMember(owner = "client!aan", name = "d", descriptor = "()Ljava/util/Iterator;", line = 126)
	public Iterator method224() {
		return new Class10(this);
	}

	@OriginalMember(owner = "client!aan", name = "c", descriptor = "()Ljava/util/Iterator;", line = 126)
	public Iterator method225() {
		return new Class10(this);
	}

	@OriginalMember(owner = "client!aan", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 126)
	@Override
	public Iterator iterator() {
		return new Class10(this);
	}
}
