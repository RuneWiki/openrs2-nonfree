package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adn")
public class Class80_Sub1_Sub1 extends Class80_Sub1 implements Interface13 {

	@OriginalMember(owner = "client!adn", name = "v", descriptor = "Lclient!er;")
	final Class232 aClass232_6 = new Class232(64);

	@OriginalMember(owner = "client!adn", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_12;

	@OriginalMember(owner = "client!adn", name = "<init>", descriptor = "(Lclient!ym;Lclient!pd;Lclient!yi;Lclient!pw;)V", line = 18)
	public Class80_Sub1_Sub1(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class667 arg2, @OriginalArg(3) Class478 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method29752(arg1.method13146().anInt5724 * 1570156841));
		this.aClass478_12 = arg3;
	}

	@OriginalMember(owner = "client!adn", name = "p", descriptor = "(II)Lclient!am;", line = 24)
	@Override
	public Interface12 method18319(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			@Pc(11) Class75_Sub2 local11 = (Class75_Sub2) this.aClass232_6.method25835((long) arg0);
			if (local11 == null) {
				local11 = this.method1651(arg0);
				this.aClass232_6.method25844(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adn", name = "v", descriptor = "(I)Lclient!am;", line = 24)
	@Override
	public Interface12 method18315(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			@Pc(11) Class75_Sub2 local11 = (Class75_Sub2) this.aClass232_6.method25835((long) arg0);
			if (local11 == null) {
				local11 = this.method1651(arg0);
				this.aClass232_6.method25844(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adn", name = "l", descriptor = "(I)Lclient!am;", line = 24)
	@Override
	public Interface12 method18314(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			@Pc(11) Class75_Sub2 local11 = (Class75_Sub2) this.aClass232_6.method25835((long) arg0);
			if (local11 == null) {
				local11 = this.method1651(arg0);
				this.aClass232_6.method25844(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adn", name = "y", descriptor = "(I)Lclient!am;", line = 24)
	@Override
	public Interface12 method18317(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			@Pc(11) Class75_Sub2 local11 = (Class75_Sub2) this.aClass232_6.method25835((long) arg0);
			if (local11 == null) {
				local11 = this.method1651(arg0);
				this.aClass232_6.method25844(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adn", name = "k", descriptor = "(I)Lclient!adc;", line = 35)
	Class75_Sub2 method1650(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass478_12.method29725(this.aClass127_6.method13146().anInt5724 * 1570156841, arg0);
		@Pc(19) Class75_Sub2 local19 = new Class75_Sub2(this.aClass127_6, arg0);
		if (local12 != null) {
			local19.method36031(new Class77_Sub39(local12));
		}
		return local19;
	}

	@OriginalMember(owner = "client!adn", name = "g", descriptor = "(II)Lclient!adc;", line = 35)
	Class75_Sub2 method1651(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass478_12.method29725(this.aClass127_6.method13146().anInt5724 * 1570156841, arg0);
		@Pc(19) Class75_Sub2 local19 = new Class75_Sub2(this.aClass127_6, arg0);
		if (local12 != null) {
			local19.method36031(new Class77_Sub39(local12));
		}
		return local19;
	}

	@OriginalMember(owner = "client!adn", name = "u", descriptor = "(I)Lclient!adc;", line = 35)
	Class75_Sub2 method1652(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass478_12.method29725(this.aClass127_6.method13146().anInt5724 * 1570156841, arg0);
		@Pc(19) Class75_Sub2 local19 = new Class75_Sub2(this.aClass127_6, arg0);
		if (local12 != null) {
			local19.method36031(new Class77_Sub39(local12));
		}
		return local19;
	}

	@OriginalMember(owner = "client!adn", name = "z", descriptor = "(I)V", line = 42)
	public void method1653() {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			this.aClass232_6.method25850();
		}
	}

	@OriginalMember(owner = "client!adn", name = "j", descriptor = "(II)V", line = 48)
	public void method1654(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			this.aClass232_6.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!adn", name = "e", descriptor = "(I)V", line = 48)
	public void method1655(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			this.aClass232_6.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!adn", name = "b", descriptor = "()V", line = 54)
	public void method1656() {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			this.aClass232_6.method25857();
		}
	}

	@OriginalMember(owner = "client!adn", name = "i", descriptor = "(I)V", line = 54)
	public void method1657() {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			this.aClass232_6.method25857();
		}
	}

	@OriginalMember(owner = "client!adn", name = "f", descriptor = "()V", line = 54)
	public void method1658() {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			this.aClass232_6.method25857();
		}
	}

	@OriginalMember(owner = "client!adn", name = "o", descriptor = "()V", line = 54)
	public void method1659() {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			this.aClass232_6.method25857();
		}
	}

	@OriginalMember(owner = "client!adn", name = "n", descriptor = "()V", line = 54)
	public void method1660() {
		@Pc(3) Class232 local3 = this.aClass232_6;
		synchronized (this.aClass232_6) {
			this.aClass232_6.method25857();
		}
	}

	@OriginalMember(owner = "client!adn", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 60)
	@Override
	public Iterator iterator() {
		return new Class267(this);
	}

	@OriginalMember(owner = "client!adn", name = "r", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1661() {
		return new Class267(this);
	}

	@OriginalMember(owner = "client!adn", name = "s", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1662() {
		return new Class267(this);
	}

	@OriginalMember(owner = "client!adn", name = "t", descriptor = "()I", line = 81)
	@Override
	public int method18316() {
		return super.method18318();
	}

	@OriginalMember(owner = "client!adn", name = "c", descriptor = "(B)I", line = 81)
	@Override
	public int method18318() {
		return super.method18318();
	}

	@OriginalMember(owner = "client!adn", name = "w", descriptor = "()I", line = 81)
	@Override
	public int method18313() {
		return super.method18318();
	}

	@OriginalMember(owner = "client!adn", name = "om", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7184)
	static final void method1663(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray9 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!adn", name = "yb", descriptor = "(Lclient!yf;I)V", line = 8948)
	static final void method1664(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.aString163 == null || local12 >= Class462.anInt4970 * -217094943) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class204.aClass50Array1[local12].aString10;
		}
	}

	@OriginalMember(owner = "client!adn", name = "akf", descriptor = "(Lclient!yf;B)V", line = 11344)
	static final void method1665(@OriginalArg(0) Class665 arg0) {
		Class492.method30038();
	}

	@OriginalMember(owner = "client!adn", name = "app", descriptor = "(Lclient!yf;I)V", line = 12323)
	static final void method1666(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}
}
