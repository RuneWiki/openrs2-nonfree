package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public class Class272 implements Iterator {

	@OriginalMember(owner = "client!kc", name = "eo", descriptor = "Lclient!qg;")
	static Class62 aClass62_4;

	@OriginalMember(owner = "client!kc", name = "tn", descriptor = "I")
	public static int anInt4297;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	int anInt4296 = 0;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	int anInt4295 = this.anAbstractQueue_Sub1_1.anInt2795 * 1065224251;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!anr;")
	AbstractQueue_Sub1 anAbstractQueue_Sub1_1;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "(ILclient!gj;Lclient!ahb;I)Lclient!amb;", line = 13)
	public static Class3_Sub1_Sub2 method25326(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) Class3_Sub41 arg2) {
		if (arg1 == Class199.aClass199_1) {
			return new Class3_Sub1_Sub2_Sub1(arg0, arg2);
		} else if (arg1 == Class199.aClass199_2) {
			return new Class3_Sub1_Sub2_Sub2(arg0, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(J)I", line = 115)
	public static int method25322(@OriginalArg(0) long arg0) {
		Class313.method25819(arg0);
		return Class599.aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!anr;)V", line = 168)
	Class272(@OriginalArg(0) AbstractQueue_Sub1 arg0) {
		this.anAbstractQueue_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "hasNext", descriptor = "()Z", line = 173)
	@Override
	public boolean hasNext() {
		return this.anInt4296 * 63575847 < this.anAbstractQueue_Sub1_1.anInt2794 * -1478446217;
	}

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "()Z", line = 173)
	public boolean method25320() {
		return this.anInt4296 * 63575847 < this.anAbstractQueue_Sub1_1.anInt2794 * -1478446217;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Ljava/lang/Object;", line = 177)
	public Object method25315() {
		if (this.anInt4295 * -1223895973 != this.anAbstractQueue_Sub1_1.anInt2795 * -2141075207) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4296 * 63575847 < this.anAbstractQueue_Sub1_1.anInt2794 * -1478446217) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass285Array1[this.anInt4296 * 63575847].anObject16;
			this.anInt4296 += 357034135;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "()Ljava/lang/Object;", line = 177)
	public Object method25316() {
		if (this.anInt4295 * -1223895973 != this.anAbstractQueue_Sub1_1.anInt2795 * -2141075207) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4296 * 63575847 < this.anAbstractQueue_Sub1_1.anInt2794 * -1478446217) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass285Array1[this.anInt4296 * 63575847].anObject16;
			this.anInt4296 += 357034135;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "()Ljava/lang/Object;", line = 177)
	public Object method25317() {
		if (this.anInt4295 * -1223895973 != this.anAbstractQueue_Sub1_1.anInt2795 * -2141075207) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4296 * 63575847 < this.anAbstractQueue_Sub1_1.anInt2794 * -1478446217) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass285Array1[this.anInt4296 * 63575847].anObject16;
			this.anInt4296 += 357034135;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "()Ljava/lang/Object;", line = 177)
	public Object method25318() {
		if (this.anInt4295 * -1223895973 != this.anAbstractQueue_Sub1_1.anInt2795 * -2141075207) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4296 * 63575847 < this.anAbstractQueue_Sub1_1.anInt2794 * -1478446217) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass285Array1[this.anInt4296 * 63575847].anObject16;
			this.anInt4296 += 357034135;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "next", descriptor = "()Ljava/lang/Object;", line = 177)
	@Override
	public Object next() {
		if (this.anInt4295 * -1223895973 != this.anAbstractQueue_Sub1_1.anInt2795 * -2141075207) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4296 * 63575847 < this.anAbstractQueue_Sub1_1.anInt2794 * -1478446217) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass285Array1[this.anInt4296 * 63575847].anObject16;
			this.anInt4296 += 357034135;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "remove", descriptor = "()V", line = 187)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "()V", line = 187)
	public void method25319() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!kc", name = "dx", descriptor = "(IIIIB)V", line = 754)
	static void method25324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) Class58_Sub1.anInt1408 / (float) Class58_Sub1.anInt1407;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class485.anInt5182 = Class58_Sub1.anInt1407 * local34 / local7 * -1310727029;
		Class161.anInt3445 = (Class58_Sub1.anInt1408 - local42 * Class58_Sub1.anInt1408 / local9) * 634470607;
		Class58_Sub1.anInt1437 = -481951965;
		Class58_Sub1.anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!kc", name = "adx", descriptor = "(Lclient!vs;I)V", line = 9295)
	static final void method25323(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class445 local17 = Class399.aClass428_1.method27917(local12);
		if (local17.anIntArray453 == null || local17.anIntArray453.length <= 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt4968 * 1610115125;
			return;
		}
		@Pc(26) int local26 = 0;
		@Pc(31) int local31 = local17.anIntArray454[0];
		for (@Pc(33) int local33 = 1; local33 < local17.anIntArray453.length; local33++) {
			if (local17.anIntArray454[local33] > local31) {
				local26 = local33;
				local31 = local17.anIntArray454[local33];
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anIntArray453[local26];
	}

	@OriginalMember(owner = "client!kc", name = "afo", descriptor = "(Lclient!vs;B)V", line = 9845)
	static final void method25321(@OriginalArg(0) Class536 arg0) {
		if (Class217.aClass65_1.method13145(82)) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "ahk", descriptor = "(Lclient!vs;I)V", line = 10326)
	static final void method25325(@OriginalArg(0) Class536 arg0) {
		@Pc(15) CharSequence local15 = (CharSequence) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575 + 1];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class476.method28797(local15);
	}
}
