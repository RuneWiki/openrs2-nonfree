package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public class Class421 implements Iterator {

	@OriginalMember(owner = "client!nk", name = "jy", descriptor = "I")
	static int anInt4804;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	int anInt4802 = 0;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
	int anInt4803 = this.anAbstractQueue_Sub1_1.anInt3154 * 745537151;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "Lclient!ass;")
	AbstractQueue_Sub1 anAbstractQueue_Sub1_1;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(Lclient!yf;I)V", line = 52)
	static void method28696(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).anInt4055 * -950684159;
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ass;)V", line = 168)
	Class421(@OriginalArg(0) AbstractQueue_Sub1 arg0) {
		this.anAbstractQueue_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "()Z", line = 173)
	public boolean method28697() {
		return this.anInt4802 * -514684453 < this.anAbstractQueue_Sub1_1.anInt3153 * 633845711;
	}

	@OriginalMember(owner = "client!nk", name = "hasNext", descriptor = "()Z", line = 173)
	@Override
	public boolean hasNext() {
		return this.anInt4802 * -514684453 < this.anAbstractQueue_Sub1_1.anInt3153 * 633845711;
	}

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "()Z", line = 173)
	public boolean method28698() {
		return this.anInt4802 * -514684453 < this.anAbstractQueue_Sub1_1.anInt3153 * 633845711;
	}

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "()Z", line = 173)
	public boolean method28699() {
		return this.anInt4802 * -514684453 < this.anAbstractQueue_Sub1_1.anInt3153 * 633845711;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "()Z", line = 173)
	public boolean method28700() {
		return this.anInt4802 * -514684453 < this.anAbstractQueue_Sub1_1.anInt3153 * 633845711;
	}

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "()Ljava/lang/Object;", line = 177)
	public Object method28701() {
		if (this.anInt4803 * 1820965865 != this.anAbstractQueue_Sub1_1.anInt3154 * 114058903) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4802 * -514684453 < this.anAbstractQueue_Sub1_1.anInt3153 * 633845711) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass424Array1[this.anInt4802 * -514684453].anObject18;
			this.anInt4802 += 711739987;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "next", descriptor = "()Ljava/lang/Object;", line = 177)
	@Override
	public Object next() {
		if (this.anInt4803 * 1820965865 != this.anAbstractQueue_Sub1_1.anInt3154 * 114058903) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4802 * -514684453 < this.anAbstractQueue_Sub1_1.anInt3153 * 633845711) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass424Array1[this.anInt4802 * -514684453].anObject18;
			this.anInt4802 += 711739987;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "()Ljava/lang/Object;", line = 177)
	public Object method28702() {
		if (this.anInt4803 * 1820965865 != this.anAbstractQueue_Sub1_1.anInt3154 * 114058903) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4802 * -514684453 < this.anAbstractQueue_Sub1_1.anInt3153 * 633845711) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass424Array1[this.anInt4802 * -514684453].anObject18;
			this.anInt4802 += 711739987;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "()V", line = 187)
	public void method28703() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!nk", name = "remove", descriptor = "()V", line = 187)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "()V", line = 187)
	public void method28704() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!yf;I)V", line = 4396)
	static final void method28705(@OriginalArg(0) Class665 arg0) {
		@Pc(9) Class75 local9 = (Class75) arg0.aClass77_Sub1_Sub9_2.anObjectArray5[arg0.anInt5786 * 662605117];
		@Pc(30) Interface18 local30 = (Interface18) (arg0.anIntArray535[arg0.anInt5786 * 662605117] == 0 ? arg0.aMap22.get(local9.aClass127_3) : arg0.aMap23.get(local9.aClass127_3));
		@Pc(35) Class489 local35 = local9.aClass498_6.method30191();
		if (Class489.aClass489_2 == local35) {
			if (Class127.aClass127_64 == local9.aClass127_3) {
				Class415.method28642(local9);
			}
			local30.method35943(local9, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		} else if (Class489.aClass489_3 == local35) {
			local30.method35945(local9, arg0.aLongArray28[(arg0.anInt5782 -= 1091885681) * 1572578961]);
		} else if (local35 == Class489.aClass489_6) {
			if (local9.aClass127_3 == Class127.aClass127_64) {
				Class145.method15076(local9);
			}
			local30.method35946(local9, arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147]);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "abf", descriptor = "(Lclient!yf;I)V", line = 9401)
	static final void method28706(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass497ArrayArray1[local23][local13].anInt5059 * -130968455;
	}
}
