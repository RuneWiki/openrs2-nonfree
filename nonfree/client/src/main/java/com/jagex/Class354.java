package com.jagex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class354 {

	@OriginalMember(owner = "client!nr", name = "be", descriptor = "[Lclient!co;")
	static Class6[] aClass6Array13;

	@OriginalMember(owner = "client!nr", name = "pd", descriptor = "I")
	static int anInt4634;

	@OriginalMember(owner = "client!nr", name = "vs", descriptor = "[S")
	public static short[] aShortArray108;

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "Ljava/util/Comparator;")
	final Comparator aComparator2;

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "J")
	final long aLong266;

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
	final int anInt4633;

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "Lclient!nz;")
	final Class360 aClass360_1;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Ljava/util/Map;")
	final Map aMap12;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Lclient!anr;")
	final AbstractQueue_Sub1 anAbstractQueue_Sub1_3;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "Lclient!anr;")
	final AbstractQueue_Sub1 anAbstractQueue_Sub1_2;

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "(I)[Lclient!sh;", line = 14)
	public static Class455[] method26624() {
		return new Class455[] { Class455.aClass455_3, Class455.aClass455_1, Class455.aClass455_2 };
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILclient!nz;)V", line = 30)
	public Class354(@OriginalArg(0) int arg0, @OriginalArg(1) Class360 arg1) {
		this(-1L, arg0, arg1);
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(JILclient!nz;)V", line = 33)
	Class354(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class360 arg2) {
		this.aComparator2 = new Class355(this);
		this.aLong266 = arg0 * 7390385653864373727L;
		this.anInt4633 = arg1 * 1563529477;
		this.aClass360_1 = arg2;
		if (this.anInt4633 * -952790067 == -1) {
			this.aMap12 = new HashMap(64);
			this.anAbstractQueue_Sub1_3 = new AbstractQueue_Sub1(64, this.aComparator2);
			this.anAbstractQueue_Sub1_2 = null;
		} else if (this.aClass360_1 == null) {
			throw new IllegalArgumentException("");
		} else {
			this.aMap12 = new HashMap(this.anInt4633 * -952790067);
			this.anAbstractQueue_Sub1_3 = new AbstractQueue_Sub1(this.anInt4633 * -952790067, this.aComparator2);
			this.anAbstractQueue_Sub1_2 = new AbstractQueue_Sub1(this.anInt4633 * -952790067);
		}
	}

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "(B)Z", line = 51)
	boolean method26607() {
		return -952790067 * this.anInt4633 != -1;
	}

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "()Z", line = 51)
	boolean method26613() {
		return -952790067 * this.anInt4633 != -1;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;", line = 55)
	public Object method26606(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (-7254682813999260129L * this.aLong266 != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method26611(local19, false);
				return local19.anObject19;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;", line = 55)
	public Object method26608(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (-7254682813999260129L * this.aLong266 != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method26611(local19, false);
				return local19.anObject19;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;", line = 55)
	public Object method26614(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (-7254682813999260129L * this.aLong266 != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method26611(local19, false);
				return local19.anObject19;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;", line = 55)
	public Object method26615(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (-7254682813999260129L * this.aLong266 != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method26611(local19, false);
				return local19.anObject19;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "z", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", line = 65)
	public Object method26618(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (this.aLong266 * -7254682813999260129L != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject19;
				local19.anObject19 = arg1;
				this.method26611(local19, false);
				return local24;
			}
			@Pc(53) Class349 local53;
			if (this.method26607() && this.aMap12.size() == this.anInt4633 * -952790067) {
				local53 = (Class349) this.anAbstractQueue_Sub1_2.remove();
				this.aMap12.remove(local53.anObject20);
				this.anAbstractQueue_Sub1_3.remove(local53);
			}
			local53 = new Class349(arg1, arg0);
			this.aMap12.put(arg0, local53);
			this.method26611(local53, true);
			return null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", line = 65)
	public Object method26620(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (this.aLong266 * -7254682813999260129L != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject19;
				local19.anObject19 = arg1;
				this.method26611(local19, false);
				return local24;
			}
			@Pc(53) Class349 local53;
			if (this.method26607() && this.aMap12.size() == this.anInt4633 * -952790067) {
				local53 = (Class349) this.anAbstractQueue_Sub1_2.remove();
				this.aMap12.remove(local53.anObject20);
				this.anAbstractQueue_Sub1_3.remove(local53);
			}
			local53 = new Class349(arg1, arg0);
			this.aMap12.put(arg0, local53);
			this.method26611(local53, true);
			return null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", line = 65)
	public Object method26623(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (this.aLong266 * -7254682813999260129L != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject19;
				local19.anObject19 = arg1;
				this.method26611(local19, false);
				return local24;
			}
			@Pc(53) Class349 local53;
			if (this.method26607() && this.aMap12.size() == this.anInt4633 * -952790067) {
				local53 = (Class349) this.anAbstractQueue_Sub1_2.remove();
				this.aMap12.remove(local53.anObject20);
				this.anAbstractQueue_Sub1_3.remove(local53);
			}
			local53 = new Class349(arg1, arg0);
			this.aMap12.put(arg0, local53);
			this.method26611(local53, true);
			return null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "ah", descriptor = "(II[I[I[F[FIIIIIIB)V", line = 85)
	static void method26627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg0 * arg7 + arg6;
		@Pc(11) int local11 = arg8 + arg1 * arg9;
		@Pc(15) int local15 = arg0 - arg10;
		@Pc(19) int local19 = arg1 - arg10;
		@Pc(23) int local23;
		@Pc(30) int local30;
		if (arg2 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = arg10 + local5;
				while (local5 < local30) {
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else if (arg4 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg3[local11++] = arg2[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = arg10 + local5;
				while (local5 < local30) {
					arg3[local11] = arg2[local5];
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;", line = 87)
	public Object method26610(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (-7254682813999260129L * this.aLong266 != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.remove(arg0);
			if (local19 == null) {
				return null;
			}
			this.anAbstractQueue_Sub1_3.remove(local19);
			if (this.method26607()) {
				this.anAbstractQueue_Sub1_2.remove(local19);
			}
			return local19.anObject19;
		}
	}

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;", line = 87)
	public Object method26616(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (-7254682813999260129L * this.aLong266 != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.remove(arg0);
			if (local19 == null) {
				return null;
			}
			this.anAbstractQueue_Sub1_3.remove(local19);
			if (this.method26607()) {
				this.anAbstractQueue_Sub1_2.remove(local19);
			}
			return local19.anObject19;
		}
	}

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;", line = 87)
	public Object method26617(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (-7254682813999260129L * this.aLong266 != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.remove(arg0);
			if (local19 == null) {
				return null;
			}
			this.anAbstractQueue_Sub1_3.remove(local19);
			if (this.method26607()) {
				this.anAbstractQueue_Sub1_2.remove(local19);
			}
			return local19.anObject19;
		}
	}

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;", line = 87)
	public Object method26619(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (-7254682813999260129L * this.aLong266 != -1L) {
				this.method26612();
			}
			@Pc(19) Class349 local19 = (Class349) this.aMap12.remove(arg0);
			if (local19 == null) {
				return null;
			}
			this.anAbstractQueue_Sub1_3.remove(local19);
			if (this.method26607()) {
				this.anAbstractQueue_Sub1_2.remove(local19);
			}
			return local19.anObject19;
		}
	}

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "(Lclient!nm;ZI)V", line = 101)
	void method26611(@OriginalArg(0) Class349 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_3.remove(arg0);
			if (this.method26607() && !this.anAbstractQueue_Sub1_2.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong265 = System.currentTimeMillis() * -2711603152140140681L;
		if (this.method26607()) {
			switch(this.aClass360_1.anInt4647 * 440610009) {
				case 0:
					arg0.aLong264 += 3694126021303989067L;
					break;
				case 1:
					arg0.aLong264 = arg0.aLong265 * -404744289792006195L;
			}
			this.anAbstractQueue_Sub1_2.add(arg0);
		}
		this.anAbstractQueue_Sub1_3.add(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(Lclient!nm;Z)V", line = 101)
	void method26621(@OriginalArg(0) Class349 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_3.remove(arg0);
			if (this.method26607() && !this.anAbstractQueue_Sub1_2.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong265 = System.currentTimeMillis() * -2711603152140140681L;
		if (this.method26607()) {
			switch(this.aClass360_1.anInt4647 * 440610009) {
				case 0:
					arg0.aLong264 += 3694126021303989067L;
					break;
				case 1:
					arg0.aLong264 = arg0.aLong265 * -404744289792006195L;
			}
			this.anAbstractQueue_Sub1_2.add(arg0);
		}
		this.anAbstractQueue_Sub1_3.add(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "(Lclient!nm;Z)V", line = 101)
	void method26622(@OriginalArg(0) Class349 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_3.remove(arg0);
			if (this.method26607() && !this.anAbstractQueue_Sub1_2.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong265 = System.currentTimeMillis() * -2711603152140140681L;
		if (this.method26607()) {
			switch(this.aClass360_1.anInt4647 * 440610009) {
				case 0:
					arg0.aLong264 += 3694126021303989067L;
					break;
				case 1:
					arg0.aLong264 = arg0.aLong265 * -404744289792006195L;
			}
			this.anAbstractQueue_Sub1_2.add(arg0);
		}
		this.anAbstractQueue_Sub1_3.add(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "()V", line = 124)
	void method26609() {
		if (this.aLong266 * -7254682813999260129L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong266 * -7254682813999260129L;
		while (!this.anAbstractQueue_Sub1_3.isEmpty()) {
			@Pc(27) Class349 local27 = (Class349) this.anAbstractQueue_Sub1_3.peek();
			if (local27.aLong265 * 7397188561692461639L >= local18) {
				return;
			}
			this.aMap12.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_3.remove(local27);
			if (this.method26607()) {
				this.anAbstractQueue_Sub1_2.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "(I)V", line = 124)
	void method26612() {
		if (this.aLong266 * -7254682813999260129L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong266 * -7254682813999260129L;
		while (!this.anAbstractQueue_Sub1_3.isEmpty()) {
			@Pc(27) Class349 local27 = (Class349) this.anAbstractQueue_Sub1_3.peek();
			if (local27.aLong265 * 7397188561692461639L >= local18) {
				return;
			}
			this.aMap12.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_3.remove(local27);
			if (this.method26607()) {
				this.anAbstractQueue_Sub1_2.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "nz", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6574)
	static final void method26625(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray33 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!nr", name = "pe", descriptor = "(Lclient!vs;B)V", line = 6886)
	static final void method26628(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3557 * 1648318741;
	}

	@OriginalMember(owner = "client!nr", name = "um", descriptor = "(Lclient!vs;B)V", line = 7822)
	static final void method26626(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local12 & 0x3FFF;
	}
}
