package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adw")
public abstract class Class80_Sub1 extends Class80 implements Interface53 {

	@OriginalMember(owner = "client!adw", name = "c", descriptor = "Lclient!pd;")
	protected final Class127 aClass127_6;

	@OriginalMember(owner = "client!adw", name = "<init>", descriptor = "(Lclient!ym;Lclient!pd;Lclient!yi;I)V", line = 19)
	Class80_Sub1(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class667 arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.aClass127_6 = arg1;
	}

	@OriginalMember(owner = "client!adw", name = "c", descriptor = "(B)I", line = 24)
	@Override
	public int method18318() {
		return this.anInt318 * -1783044979;
	}

	@OriginalMember(owner = "client!adw", name = "w", descriptor = "()I", line = 24)
	@Override
	public int method18313() {
		return this.anInt318 * -1783044979;
	}

	@OriginalMember(owner = "client!adw", name = "t", descriptor = "()I", line = 24)
	@Override
	public int method18316() {
		return this.anInt318 * -1783044979;
	}

	@OriginalMember(owner = "client!adw", name = "ao", descriptor = "([Lclient!adw;)Ljava/util/Map;", line = 28)
	public static Map method1943(@OriginalArg(0) Class80_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class80_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class80_Sub1 local23 = local13[local15];
			local11.put(local23.aClass127_6, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!adw", name = "au", descriptor = "([Lclient!adw;)Ljava/util/Map;", line = 28)
	public static Map method1944(@OriginalArg(0) Class80_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class80_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class80_Sub1 local23 = local13[local15];
			local11.put(local23.aClass127_6, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!adw", name = "ak", descriptor = "([Lclient!adw;)Ljava/util/Map;", line = 28)
	public static Map method1945(@OriginalArg(0) Class80_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class80_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class80_Sub1 local23 = local13[local15];
			local11.put(local23.aClass127_6, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!adw", name = "q", descriptor = "(II)Ljava/lang/Object;", line = 43)
	@Override
	public Object method1940(@OriginalArg(0) int arg0) {
		@Pc(5) Class75 local5 = (Class75) this.method18319(arg0);
		return local5 != null && local5.method1138() ? local5.method1144() : null;
	}

	@OriginalMember(owner = "client!adw", name = "x", descriptor = "(I)Ljava/lang/Object;", line = 43)
	@Override
	public Object method1941(@OriginalArg(0) int arg0) {
		@Pc(5) Class75 local5 = (Class75) this.method18319(arg0);
		return local5 != null && local5.method1138() ? local5.method1144() : null;
	}

	@OriginalMember(owner = "client!adw", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 43)
	@Override
	public Object method1942(@OriginalArg(0) int arg0) {
		@Pc(5) Class75 local5 = (Class75) this.method18319(arg0);
		return local5 != null && local5.method1138() ? local5.method1144() : null;
	}

	@OriginalMember(owner = "client!adw", name = "aj", descriptor = "(Lclient!oe;B)I", line = 49)
	public int method1946(@OriginalArg(0) Class438 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class430.method28814((String) arg0.anObject19);
		} else if (arg0.anObject19 instanceof Interface7) {
			local6 = local1 + ((Interface7) arg0.anObject19).method14427();
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!adw", name = "ax", descriptor = "(Lclient!oe;)I", line = 49)
	public int method1947(@OriginalArg(0) Class438 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class430.method28814((String) arg0.anObject19);
		} else if (arg0.anObject19 instanceof Interface7) {
			local6 = local1 + ((Interface7) arg0.anObject19).method14427();
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!adw", name = "ai", descriptor = "(Lclient!akv;Lclient!oe;B)V", line = 59)
	public void method1948(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class438 arg1) {
		arg0.method22408(arg1.anInt4927 * -608978823);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method22417((Integer) arg1.anObject19);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method22428((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method22444((String) arg1.anObject19);
		} else if (arg1.anObject19 instanceof Interface7) {
			((Interface7) arg1.anObject19).method14425(arg0);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!adw", name = "ag", descriptor = "(Lclient!akv;B)Lclient!oe;", line = 68)
	public Class438 method1949(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(9) Class75 local9 = (Class75) this.method18319(local3);
		if (!local9.method1138()) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class438 local23 = new Class438(local3);
		@Pc(29) Class local29 = local9.aClass498_6.method30191().aClass2;
		if (Integer.class == local29) {
			local23.anObject19 = arg0.method22500();
		} else if (local29 == Long.class) {
			local23.anObject19 = arg0.method22510();
		} else if (local29 == String.class) {
			local23.anObject19 = arg0.method22526();
		} else if (Interface7.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Interface7 local66 = (Interface7) local29.getDeclaredConstructor().newInstance();
				local66.method14431(arg0);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!adw", name = "ar", descriptor = "(Lclient!akv;)Lclient!oe;", line = 68)
	public Class438 method1950(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(9) Class75 local9 = (Class75) this.method18319(local3);
		if (!local9.method1138()) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class438 local23 = new Class438(local3);
		@Pc(29) Class local29 = local9.aClass498_6.method30191().aClass2;
		if (Integer.class == local29) {
			local23.anObject19 = arg0.method22500();
		} else if (local29 == Long.class) {
			local23.anObject19 = arg0.method22510();
		} else if (local29 == String.class) {
			local23.anObject19 = arg0.method22526();
		} else if (Interface7.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Interface7 local66 = (Interface7) local29.getDeclaredConstructor().newInstance();
				local66.method14431(arg0);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!adw", name = "ad", descriptor = "(Lclient!akv;)Lclient!oe;", line = 68)
	public Class438 method1951(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(9) Class75 local9 = (Class75) this.method18319(local3);
		if (!local9.method1138()) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class438 local23 = new Class438(local3);
		@Pc(29) Class local29 = local9.aClass498_6.method30191().aClass2;
		if (Integer.class == local29) {
			local23.anObject19 = arg0.method22500();
		} else if (local29 == Long.class) {
			local23.anObject19 = arg0.method22510();
		} else if (local29 == String.class) {
			local23.anObject19 = arg0.method22526();
		} else if (Interface7.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Interface7 local66 = (Interface7) local29.getDeclaredConstructor().newInstance();
				local66.method14431(arg0);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!adw", name = "al", descriptor = "(Lclient!akv;Lclient!qj;I)Lclient!oe;", line = 90)
	public Class438 method1952(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(8) Class438 local8 = new Class438(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (local11 == Integer.class) {
			local8.anObject19 = arg0.method22500();
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22510();
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22526();
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14431(arg0);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class75 local70 = (Class75) this.method18319(local3);
		return local70.method1138() && local70.aClass498_6.method30191() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!adw", name = "ac", descriptor = "(Lclient!akv;Lclient!qj;)Lclient!oe;", line = 90)
	public Class438 method1953(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(8) Class438 local8 = new Class438(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (local11 == Integer.class) {
			local8.anObject19 = arg0.method22500();
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22510();
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22526();
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14431(arg0);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class75 local70 = (Class75) this.method18319(local3);
		return local70.method1138() && local70.aClass498_6.method30191() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!adw", name = "av", descriptor = "(Lclient!akv;Lclient!qj;)Lclient!oe;", line = 90)
	public Class438 method1954(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(8) Class438 local8 = new Class438(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (local11 == Integer.class) {
			local8.anObject19 = arg0.method22500();
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22510();
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22526();
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14431(arg0);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class75 local70 = (Class75) this.method18319(local3);
		return local70.method1138() && local70.aClass498_6.method30191() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!adw", name = "as", descriptor = "(I)I", line = 525)
	public static int method1955() {
		return Class529.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!adw", name = "m", descriptor = "(III)I", line = 1613)
	static final int method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(35) int local35 = Class555.method31076(arg0 - 1, arg1 - 1) + Class555.method31076(arg0 + 1, arg1 - 1) + Class555.method31076(arg0 - 1, arg1 + 1) + Class555.method31076(arg0 + 1, arg1 + 1);
		@Pc(63) int local63 = Class555.method31076(arg0 - 1, arg1) + Class555.method31076(arg0 + 1, arg1) + Class555.method31076(arg0, arg1 - 1) + Class555.method31076(arg0, arg1 + 1);
		@Pc(68) int local68 = Class555.method31076(arg0, arg1);
		return local35 / 16 + local63 / 8 + local68 / 4;
	}

	@OriginalMember(owner = "client!adw", name = "gc", descriptor = "(Lclient!yf;I)V", line = 5613)
	static final void method1957(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class330.method27594(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!adw", name = "acx", descriptor = "(Lclient!yf;I)V", line = 9601)
	static final void method1958(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 ^ 0x1 << local23;
	}

	@OriginalMember(owner = "client!adw", name = "p", descriptor = "(II)Lclient!am;")
	public abstract Interface12 method18319(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!adw", name = "v", descriptor = "(I)Lclient!am;")
	public abstract Interface12 method18315(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!adw", name = "y", descriptor = "(I)Lclient!am;")
	public abstract Interface12 method18317(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!adw", name = "l", descriptor = "(I)Lclient!am;")
	public abstract Interface12 method18314(@OriginalArg(0) int arg0);
}
