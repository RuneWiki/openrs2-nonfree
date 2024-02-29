package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ady")
public class Class80_Sub1_Sub2 extends Class80_Sub1 implements Interface13 {

	@OriginalMember(owner = "client!ady", name = "v", descriptor = "Lclient!er;")
	final Class232 aClass232_7 = new Class232(64);

	@OriginalMember(owner = "client!ady", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_13;

	@OriginalMember(owner = "client!ady", name = "<init>", descriptor = "(Lclient!ym;Lclient!pd;Lclient!yi;Lclient!pw;)V", line = 18)
	public Class80_Sub1_Sub2(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class667 arg2, @OriginalArg(3) Class478 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method29752(arg1.method13146().anInt5724 * 1570156841));
		this.aClass478_13 = arg3;
	}

	@OriginalMember(owner = "client!ady", name = "p", descriptor = "(II)Lclient!am;", line = 24)
	@Override
	public Interface12 method18319(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			@Pc(11) Class75_Sub1 local11 = (Class75_Sub1) this.aClass232_7.method25835((long) arg0);
			if (local11 == null) {
				local11 = this.method1959(arg0);
				this.aClass232_7.method25844(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ady", name = "v", descriptor = "(I)Lclient!am;", line = 24)
	@Override
	public Interface12 method18315(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			@Pc(11) Class75_Sub1 local11 = (Class75_Sub1) this.aClass232_7.method25835((long) arg0);
			if (local11 == null) {
				local11 = this.method1959(arg0);
				this.aClass232_7.method25844(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ady", name = "l", descriptor = "(I)Lclient!am;", line = 24)
	@Override
	public Interface12 method18314(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			@Pc(11) Class75_Sub1 local11 = (Class75_Sub1) this.aClass232_7.method25835((long) arg0);
			if (local11 == null) {
				local11 = this.method1959(arg0);
				this.aClass232_7.method25844(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ady", name = "y", descriptor = "(I)Lclient!am;", line = 24)
	@Override
	public Interface12 method18317(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			@Pc(11) Class75_Sub1 local11 = (Class75_Sub1) this.aClass232_7.method25835((long) arg0);
			if (local11 == null) {
				local11 = this.method1959(arg0);
				this.aClass232_7.method25844(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ady", name = "g", descriptor = "(II)Lclient!adb;", line = 35)
	Class75_Sub1 method1959(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass478_13.method29725(this.aClass127_6.method13146().anInt5724 * 1570156841, arg0);
		@Pc(19) Class75_Sub1 local19 = new Class75_Sub1(this.aClass127_6, arg0);
		if (local12 != null) {
			local19.method36031(new Class77_Sub39(local12));
		}
		return local19;
	}

	@OriginalMember(owner = "client!ady", name = "k", descriptor = "(I)Lclient!adb;", line = 35)
	Class75_Sub1 method1960(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass478_13.method29725(this.aClass127_6.method13146().anInt5724 * 1570156841, arg0);
		@Pc(19) Class75_Sub1 local19 = new Class75_Sub1(this.aClass127_6, arg0);
		if (local12 != null) {
			local19.method36031(new Class77_Sub39(local12));
		}
		return local19;
	}

	@OriginalMember(owner = "client!ady", name = "u", descriptor = "(I)Lclient!adb;", line = 35)
	Class75_Sub1 method1961(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass478_13.method29725(this.aClass127_6.method13146().anInt5724 * 1570156841, arg0);
		@Pc(19) Class75_Sub1 local19 = new Class75_Sub1(this.aClass127_6, arg0);
		if (local12 != null) {
			local19.method36031(new Class77_Sub39(local12));
		}
		return local19;
	}

	@OriginalMember(owner = "client!ady", name = "e", descriptor = "(I)Lclient!adb;", line = 35)
	Class75_Sub1 method1962(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass478_13.method29725(this.aClass127_6.method13146().anInt5724 * 1570156841, arg0);
		@Pc(19) Class75_Sub1 local19 = new Class75_Sub1(this.aClass127_6, arg0);
		if (local12 != null) {
			local19.method36031(new Class77_Sub39(local12));
		}
		return local19;
	}

	@OriginalMember(owner = "client!ady", name = "z", descriptor = "(S)V", line = 42)
	public void method1963() {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25850();
		}
	}

	@OriginalMember(owner = "client!ady", name = "j", descriptor = "(II)V", line = 48)
	public void method1964(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!ady", name = "i", descriptor = "(B)V", line = 54)
	public void method1965() {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25857();
		}
	}

	@OriginalMember(owner = "client!ady", name = "a", descriptor = "()V", line = 54)
	public void method1966() {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25857();
		}
	}

	@OriginalMember(owner = "client!ady", name = "b", descriptor = "()V", line = 54)
	public void method1967() {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25857();
		}
	}

	@OriginalMember(owner = "client!ady", name = "m", descriptor = "()V", line = 54)
	public void method1968() {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25857();
		}
	}

	@OriginalMember(owner = "client!ady", name = "o", descriptor = "()V", line = 54)
	public void method1969() {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25857();
		}
	}

	@OriginalMember(owner = "client!ady", name = "n", descriptor = "()V", line = 54)
	public void method1970() {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25857();
		}
	}

	@OriginalMember(owner = "client!ady", name = "f", descriptor = "()V", line = 54)
	public void method1971() {
		@Pc(3) Class232 local3 = this.aClass232_7;
		synchronized (this.aClass232_7) {
			this.aClass232_7.method25857();
		}
	}

	@OriginalMember(owner = "client!ady", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 60)
	@Override
	public Iterator iterator() {
		return new Class633(this);
	}

	@OriginalMember(owner = "client!ady", name = "s", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1972() {
		return new Class633(this);
	}

	@OriginalMember(owner = "client!ady", name = "r", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1973() {
		return new Class633(this);
	}

	@OriginalMember(owner = "client!ady", name = "w", descriptor = "()I", line = 81)
	@Override
	public int method18313() {
		return super.method18318();
	}

	@OriginalMember(owner = "client!ady", name = "t", descriptor = "()I", line = 81)
	@Override
	public int method18316() {
		return super.method18318();
	}

	@OriginalMember(owner = "client!ady", name = "c", descriptor = "(B)I", line = 81)
	@Override
	public int method18318() {
		return super.method18318();
	}
}
