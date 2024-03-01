package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xn")
public final class Class581 implements Iterable {

	@OriginalMember(owner = "client!xn", name = "g", descriptor = "J")
	long aLong292;

	@OriginalMember(owner = "client!xn", name = "l", descriptor = "Lclient!ps;")
	Class3 aClass3_241;

	@OriginalMember(owner = "client!xn", name = "h", descriptor = "Lclient!ps;")
	Class3 aClass3_242;

	@OriginalMember(owner = "client!xn", name = "x", descriptor = "I")
	int anInt5447 = 0;

	@OriginalMember(owner = "client!xn", name = "p", descriptor = "I")
	int anInt5448;

	@OriginalMember(owner = "client!xn", name = "a", descriptor = "[Lclient!ps;")
	Class3[] aClass3Array4;

	@OriginalMember(owner = "client!xn", name = "<init>", descriptor = "(I)V", line = 14)
	public Class581(@OriginalArg(0) int arg0) {
		this.anInt5448 = arg0 * -40759503;
		this.aClass3Array4 = new Class3[arg0];
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			@Pc(27) Class3 local27 = this.aClass3Array4[local15] = new Class3();
			local27.aClass3_246 = local27;
			local27.aClass3_245 = local27;
		}
	}

	@OriginalMember(owner = "client!xn", name = "p", descriptor = "(J)Lclient!ps;", line = 25)
	public Class3 method33217(@OriginalArg(0) long arg0) {
		this.aLong292 = arg0 * -476023385541262929L;
		@Pc(18) Class3 local18 = this.aClass3Array4[(int) (arg0 & (long) (this.anInt5448 * 1531898321 - 1))];
		for (this.aClass3_241 = local18.aClass3_246; this.aClass3_241 != local18; this.aClass3_241 = this.aClass3_241.aClass3_246) {
			if (arg0 == this.aClass3_241.aLong296 * -1930649055099428229L) {
				@Pc(37) Class3 local37 = this.aClass3_241;
				this.aClass3_241 = this.aClass3_241.aClass3_246;
				return local37;
			}
		}
		this.aClass3_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!xn", name = "z", descriptor = "(J)Lclient!ps;", line = 25)
	public Class3 method33227(@OriginalArg(0) long arg0) {
		this.aLong292 = arg0 * -476023385541262929L;
		@Pc(18) Class3 local18 = this.aClass3Array4[(int) (arg0 & (long) (this.anInt5448 * 1531898321 - 1))];
		for (this.aClass3_241 = local18.aClass3_246; this.aClass3_241 != local18; this.aClass3_241 = this.aClass3_241.aClass3_246) {
			if (arg0 == this.aClass3_241.aLong296 * -1930649055099428229L) {
				@Pc(37) Class3 local37 = this.aClass3_241;
				this.aClass3_241 = this.aClass3_241.aClass3_246;
				return local37;
			}
		}
		this.aClass3_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!xn", name = "a", descriptor = "(I)Lclient!ps;", line = 41)
	public Class3 method33218() {
		if (this.aClass3_241 == null) {
			return null;
		}
		@Pc(22) Class3 local22 = this.aClass3Array4[(int) (this.aLong292 * -5881056345310022321L & (long) (this.anInt5448 * 1531898321 - 1))];
		while (this.aClass3_241 != local22) {
			if (this.aLong292 * -5881056345310022321L == this.aClass3_241.aLong296 * -1930649055099428229L) {
				@Pc(40) Class3 local40 = this.aClass3_241;
				this.aClass3_241 = this.aClass3_241.aClass3_246;
				return local40;
			}
			this.aClass3_241 = this.aClass3_241.aClass3_246;
		}
		this.aClass3_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!xn", name = "j", descriptor = "()Lclient!ps;", line = 41)
	public Class3 method33228() {
		if (this.aClass3_241 == null) {
			return null;
		}
		@Pc(22) Class3 local22 = this.aClass3Array4[(int) (this.aLong292 * -5881056345310022321L & (long) (this.anInt5448 * 1531898321 - 1))];
		while (this.aClass3_241 != local22) {
			if (this.aLong292 * -5881056345310022321L == this.aClass3_241.aLong296 * -1930649055099428229L) {
				@Pc(40) Class3 local40 = this.aClass3_241;
				this.aClass3_241 = this.aClass3_241.aClass3_246;
				return local40;
			}
			this.aClass3_241 = this.aClass3_241.aClass3_246;
		}
		this.aClass3_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!xn", name = "n", descriptor = "()Lclient!ps;", line = 41)
	public Class3 method33229() {
		if (this.aClass3_241 == null) {
			return null;
		}
		@Pc(22) Class3 local22 = this.aClass3Array4[(int) (this.aLong292 * -5881056345310022321L & (long) (this.anInt5448 * 1531898321 - 1))];
		while (this.aClass3_241 != local22) {
			if (this.aLong292 * -5881056345310022321L == this.aClass3_241.aLong296 * -1930649055099428229L) {
				@Pc(40) Class3 local40 = this.aClass3_241;
				this.aClass3_241 = this.aClass3_241.aClass3_246;
				return local40;
			}
			this.aClass3_241 = this.aClass3_241.aClass3_246;
		}
		this.aClass3_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!xn", name = "e", descriptor = "([Lclient!ps;)I", line = 56)
	public int method33216(@OriginalArg(0) Class3[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5448 * 1531898321; local3++) {
			@Pc(14) Class3 local14 = this.aClass3Array4[local3];
			for (@Pc(17) Class3 local17 = local14.aClass3_246; local17 != local14; local17 = local17.aClass3_246) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!xn", name = "g", descriptor = "([Lclient!ps;I)I", line = 56)
	public int method33223(@OriginalArg(0) Class3[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5448 * 1531898321; local3++) {
			@Pc(14) Class3 local14 = this.aClass3Array4[local3];
			for (@Pc(17) Class3 local17 = local14.aClass3_246; local17 != local14; local17 = local17.aClass3_246) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!xn", name = "s", descriptor = "(I)I", line = 69)
	public int method33220() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5448 * 1531898321; local3++) {
			@Pc(14) Class3 local14 = this.aClass3Array4[local3];
			for (@Pc(17) Class3 local17 = local14.aClass3_246; local17 != local14; local17 = local17.aClass3_246) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!xn", name = "r", descriptor = "()I", line = 69)
	public int method33233() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5448 * 1531898321; local3++) {
			@Pc(14) Class3 local14 = this.aClass3Array4[local3];
			for (@Pc(17) Class3 local17 = local14.aClass3_246; local17 != local14; local17 = local17.aClass3_246) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!xn", name = "d", descriptor = "(Lclient!ps;J)V", line = 82)
	public void method33232(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_245 != null) {
			arg0.method33656();
		}
		@Pc(20) Class3 local20 = this.aClass3Array4[(int) (arg1 & (long) (this.anInt5448 * 1531898321 - 1))];
		arg0.aClass3_245 = local20.aClass3_245;
		arg0.aClass3_246 = local20;
		arg0.aClass3_245.aClass3_246 = arg0;
		arg0.aClass3_246.aClass3_245 = arg0;
		arg0.aLong296 = arg1 * 7335455165921340595L;
	}

	@OriginalMember(owner = "client!xn", name = "m", descriptor = "(Lclient!ps;J)V", line = 82)
	public void method33234(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_245 != null) {
			arg0.method33656();
		}
		@Pc(20) Class3 local20 = this.aClass3Array4[(int) (arg1 & (long) (this.anInt5448 * 1531898321 - 1))];
		arg0.aClass3_245 = local20.aClass3_245;
		arg0.aClass3_246 = local20;
		arg0.aClass3_245.aClass3_246 = arg0;
		arg0.aClass3_246.aClass3_245 = arg0;
		arg0.aLong296 = arg1 * 7335455165921340595L;
	}

	@OriginalMember(owner = "client!xn", name = "v", descriptor = "(Lclient!ps;J)V", line = 82)
	public void method33235(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_245 != null) {
			arg0.method33656();
		}
		@Pc(20) Class3 local20 = this.aClass3Array4[(int) (arg1 & (long) (this.anInt5448 * 1531898321 - 1))];
		arg0.aClass3_245 = local20.aClass3_245;
		arg0.aClass3_246 = local20;
		arg0.aClass3_245.aClass3_246 = arg0;
		arg0.aClass3_246.aClass3_245 = arg0;
		arg0.aLong296 = arg1 * 7335455165921340595L;
	}

	@OriginalMember(owner = "client!xn", name = "q", descriptor = "(Lclient!ps;J)V", line = 82)
	public void method33236(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_245 != null) {
			arg0.method33656();
		}
		@Pc(20) Class3 local20 = this.aClass3Array4[(int) (arg1 & (long) (this.anInt5448 * 1531898321 - 1))];
		arg0.aClass3_245 = local20.aClass3_245;
		arg0.aClass3_246 = local20;
		arg0.aClass3_245.aClass3_246 = arg0;
		arg0.aClass3_246.aClass3_245 = arg0;
		arg0.aLong296 = arg1 * 7335455165921340595L;
	}

	@OriginalMember(owner = "client!xn", name = "t", descriptor = "(Lclient!ps;J)V", line = 82)
	public void method33240(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_245 != null) {
			arg0.method33656();
		}
		@Pc(20) Class3 local20 = this.aClass3Array4[(int) (arg1 & (long) (this.anInt5448 * 1531898321 - 1))];
		arg0.aClass3_245 = local20.aClass3_245;
		arg0.aClass3_246 = local20;
		arg0.aClass3_245.aClass3_246 = arg0;
		arg0.aClass3_246.aClass3_245 = arg0;
		arg0.aLong296 = arg1 * 7335455165921340595L;
	}

	@OriginalMember(owner = "client!xn", name = "u", descriptor = "(Lclient!ps;J)V", line = 82)
	public void method33241(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_245 != null) {
			arg0.method33656();
		}
		@Pc(20) Class3 local20 = this.aClass3Array4[(int) (arg1 & (long) (this.anInt5448 * 1531898321 - 1))];
		arg0.aClass3_245 = local20.aClass3_245;
		arg0.aClass3_246 = local20;
		arg0.aClass3_245.aClass3_246 = arg0;
		arg0.aClass3_246.aClass3_245 = arg0;
		arg0.aLong296 = arg1 * 7335455165921340595L;
	}

	@OriginalMember(owner = "client!xn", name = "y", descriptor = "(B)V", line = 92)
	public void method33222() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5448 * 1531898321; local1++) {
			@Pc(12) Class3 local12 = this.aClass3Array4[local1];
			while (true) {
				@Pc(15) Class3 local15 = local12.aClass3_246;
				if (local12 == local15) {
					break;
				}
				local15.method33656();
			}
		}
		this.aClass3_241 = null;
		this.aClass3_242 = null;
	}

	@OriginalMember(owner = "client!xn", name = "w", descriptor = "()V", line = 92)
	public void method33237() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5448 * 1531898321; local1++) {
			@Pc(12) Class3 local12 = this.aClass3Array4[local1];
			while (true) {
				@Pc(15) Class3 local15 = local12.aClass3_246;
				if (local12 == local15) {
					break;
				}
				local15.method33656();
			}
		}
		this.aClass3_241 = null;
		this.aClass3_242 = null;
	}

	@OriginalMember(owner = "client!xn", name = "o", descriptor = "()V", line = 92)
	public void method33238() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5448 * 1531898321; local1++) {
			@Pc(12) Class3 local12 = this.aClass3Array4[local1];
			while (true) {
				@Pc(15) Class3 local15 = local12.aClass3_246;
				if (local12 == local15) {
					break;
				}
				local15.method33656();
			}
		}
		this.aClass3_241 = null;
		this.aClass3_242 = null;
	}

	@OriginalMember(owner = "client!xn", name = "b", descriptor = "(B)Lclient!ps;", line = 105)
	public Class3 method33221() {
		this.anInt5447 = 0;
		return this.method33231();
	}

	@OriginalMember(owner = "client!xn", name = "i", descriptor = "()Lclient!ps;", line = 105)
	public Class3 method33230() {
		this.anInt5447 = 0;
		return this.method33231();
	}

	@OriginalMember(owner = "client!xn", name = "f", descriptor = "()Lclient!ps;", line = 105)
	public Class3 method33239() {
		this.anInt5447 = 0;
		return this.method33231();
	}

	@OriginalMember(owner = "client!xn", name = "k", descriptor = "()Lclient!ps;", line = 110)
	public Class3 method33219() {
		@Pc(19) Class3 local19;
		if (this.anInt5447 * -879111041 > 0 && this.aClass3_242 != this.aClass3Array4[this.anInt5447 * -879111041 - 1]) {
			local19 = this.aClass3_242;
			this.aClass3_242 = local19.aClass3_246;
			return local19;
		}
		do {
			if (this.anInt5447 * -879111041 >= this.anInt5448 * 1531898321) {
				return null;
			}
			local19 = this.aClass3Array4[(this.anInt5447 += 2078403455) * -879111041 - 1].aClass3_246;
		} while (this.aClass3Array4[this.anInt5447 * -879111041 - 1] == local19);
		this.aClass3_242 = local19.aClass3_246;
		return local19;
	}

	@OriginalMember(owner = "client!xn", name = "c", descriptor = "(B)Lclient!ps;", line = 110)
	public Class3 method33231() {
		@Pc(19) Class3 local19;
		if (this.anInt5447 * -879111041 > 0 && this.aClass3_242 != this.aClass3Array4[this.anInt5447 * -879111041 - 1]) {
			local19 = this.aClass3_242;
			this.aClass3_242 = local19.aClass3_246;
			return local19;
		}
		do {
			if (this.anInt5447 * -879111041 >= this.anInt5448 * 1531898321) {
				return null;
			}
			local19 = this.aClass3Array4[(this.anInt5447 += 2078403455) * -879111041 - 1].aClass3_246;
		} while (this.aClass3Array4[this.anInt5447 * -879111041 - 1] == local19);
		this.aClass3_242 = local19.aClass3_246;
		return local19;
	}

	@OriginalMember(owner = "client!xn", name = "at", descriptor = "()Lclient!ps;", line = 110)
	public Class3 method33242() {
		@Pc(19) Class3 local19;
		if (this.anInt5447 * -879111041 > 0 && this.aClass3_242 != this.aClass3Array4[this.anInt5447 * -879111041 - 1]) {
			local19 = this.aClass3_242;
			this.aClass3_242 = local19.aClass3_246;
			return local19;
		}
		do {
			if (this.anInt5447 * -879111041 >= this.anInt5448 * 1531898321) {
				return null;
			}
			local19 = this.aClass3Array4[(this.anInt5447 += 2078403455) * -879111041 - 1].aClass3_246;
		} while (this.aClass3Array4[this.anInt5447 * -879111041 - 1] == local19);
		this.aClass3_242 = local19.aClass3_246;
		return local19;
	}

	@OriginalMember(owner = "client!xn", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 126)
	@Override
	public Iterator iterator() {
		return new Class582(this);
	}

	@OriginalMember(owner = "client!xn", name = "l", descriptor = "()Ljava/util/Iterator;", line = 126)
	public Iterator method33224() {
		return new Class582(this);
	}

	@OriginalMember(owner = "client!xn", name = "h", descriptor = "()Ljava/util/Iterator;", line = 126)
	public Iterator method33225() {
		return new Class582(this);
	}

	@OriginalMember(owner = "client!xn", name = "x", descriptor = "()Ljava/util/Iterator;", line = 126)
	public Iterator method33226() {
		return new Class582(this);
	}

	@OriginalMember(owner = "client!xn", name = "ip", descriptor = "(Lclient!vs;S)V", line = 5575)
	static final void method33243(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class344.method26489(local16, local22, arg0);
	}
}
