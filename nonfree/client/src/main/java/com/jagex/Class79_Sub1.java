package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!add")
public abstract class Class79_Sub1 extends Class79 implements Interface51 {

	@OriginalMember(owner = "client!add", name = "n", descriptor = "Lclient!qe;")
	protected final Class138 aClass138_3;

	@OriginalMember(owner = "client!add", name = "<init>", descriptor = "(Lclient!zd;Lclient!qe;Lclient!zt;I)V", line = 19)
	Class79_Sub1(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.aClass138_3 = arg1;
	}

	@OriginalMember(owner = "client!add", name = "l", descriptor = "()I", line = 24)
	@Override
	public int method18267() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!add", name = "n", descriptor = "(I)I", line = 24)
	@Override
	public int method18262() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!add", name = "w", descriptor = "()I", line = 24)
	@Override
	public int method18266() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!add", name = "f", descriptor = "()I", line = 24)
	@Override
	public int method18263() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!add", name = "al", descriptor = "([Lclient!add;)Ljava/util/Map;", line = 28)
	public static Map method1466(@OriginalArg(0) Class79_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class79_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class79_Sub1 local23 = local13[local15];
			local11.put(local23.aClass138_3, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!add", name = "u", descriptor = "(IB)Ljava/lang/Object;", line = 43)
	@Override
	public Object method1460(@OriginalArg(0) int arg0) {
		@Pc(5) Class108 local5 = (Class108) this.method18261(arg0);
		return local5 != null && local5.method7437() ? local5.method7438() : null;
	}

	@OriginalMember(owner = "client!add", name = "z", descriptor = "(I)Ljava/lang/Object;", line = 43)
	@Override
	public Object method1459(@OriginalArg(0) int arg0) {
		@Pc(5) Class108 local5 = (Class108) this.method18261(arg0);
		return local5 != null && local5.method7437() ? local5.method7438() : null;
	}

	@OriginalMember(owner = "client!add", name = "t", descriptor = "(Lclient!on;B)I", line = 49)
	public int method1461(@OriginalArg(0) Class466 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class582.method31414((String) arg0.anObject19);
		} else if (arg0.anObject19 instanceof Interface6) {
			local6 = local1 + ((Interface6) arg0.anObject19).method13865();
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!add", name = "ac", descriptor = "(Lclient!on;)I", line = 49)
	public int method1465(@OriginalArg(0) Class466 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class582.method31414((String) arg0.anObject19);
		} else if (arg0.anObject19 instanceof Interface6) {
			local6 = local1 + ((Interface6) arg0.anObject19).method13865();
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!add", name = "ai", descriptor = "(Lclient!on;)I", line = 49)
	public int method1467(@OriginalArg(0) Class466 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class582.method31414((String) arg0.anObject19);
		} else if (arg0.anObject19 instanceof Interface6) {
			local6 = local1 + ((Interface6) arg0.anObject19).method13865();
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!add", name = "ae", descriptor = "(Lclient!alw;Lclient!on;I)V", line = 59)
	public void method1462(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class466 arg1) {
		arg0.method22454(arg1.anInt5092 * -1181855333);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method22395((Integer) arg1.anObject19);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method22399((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method22403((String) arg1.anObject19);
		} else if (arg1.anObject19 instanceof Interface6) {
			((Interface6) arg1.anObject19).method13861(arg0);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "aw", descriptor = "(Lclient!alw;Lclient!on;)V", line = 59)
	public void method1468(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class466 arg1) {
		arg0.method22454(arg1.anInt5092 * -1181855333);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method22395((Integer) arg1.anObject19);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method22399((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method22403((String) arg1.anObject19);
		} else if (arg1.anObject19 instanceof Interface6) {
			((Interface6) arg1.anObject19).method13861(arg0);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "as", descriptor = "(Lclient!alw;Lclient!on;)V", line = 59)
	public void method1469(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class466 arg1) {
		arg0.method22454(arg1.anInt5092 * -1181855333);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method22395((Integer) arg1.anObject19);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method22399((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method22403((String) arg1.anObject19);
		} else if (arg1.anObject19 instanceof Interface6) {
			((Interface6) arg1.anObject19).method13861(arg0);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "ag", descriptor = "(Lclient!alw;B)Lclient!on;", line = 68)
	public Class466 method1463(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22415();
		@Pc(9) Class108 local9 = (Class108) this.method18261(local3);
		if (!local9.method7437()) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class466 local23 = new Class466(local3);
		@Pc(29) Class local29 = local9.aClass519_6.method30311().aClass2;
		if (local29 == Integer.class) {
			local23.anObject19 = arg0.method22419();
		} else if (Long.class == local29) {
			local23.anObject19 = arg0.method22423();
		} else if (String.class == local29) {
			local23.anObject19 = arg0.method22428();
		} else if (Interface6.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Interface6 local66 = (Interface6) local29.getDeclaredConstructor().newInstance();
				local66.method13862(arg0);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!add", name = "at", descriptor = "(Lclient!alw;)Lclient!on;", line = 68)
	public Class466 method1470(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22415();
		@Pc(9) Class108 local9 = (Class108) this.method18261(local3);
		if (!local9.method7437()) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class466 local23 = new Class466(local3);
		@Pc(29) Class local29 = local9.aClass519_6.method30311().aClass2;
		if (local29 == Integer.class) {
			local23.anObject19 = arg0.method22419();
		} else if (Long.class == local29) {
			local23.anObject19 = arg0.method22423();
		} else if (String.class == local29) {
			local23.anObject19 = arg0.method22428();
		} else if (Interface6.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Interface6 local66 = (Interface6) local29.getDeclaredConstructor().newInstance();
				local66.method13862(arg0);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!add", name = "ah", descriptor = "(Lclient!alw;Lclient!qa;B)Lclient!on;", line = 90)
	public Class466 method1464(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class500 arg1) {
		@Pc(3) int local3 = arg0.method22415();
		@Pc(8) Class466 local8 = new Class466(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method22419();
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22423();
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22428();
		} else if (Interface6.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface6 local48 = (Interface6) local11.getDeclaredConstructor().newInstance();
				local48.method13862(arg0);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class108 local70 = (Class108) this.method18261(local3);
		return local70.method7437() && local70.aClass519_6.method30311() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "ad", descriptor = "(Lclient!alw;Lclient!qa;)Lclient!on;", line = 90)
	public Class466 method1471(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class500 arg1) {
		@Pc(3) int local3 = arg0.method22415();
		@Pc(8) Class466 local8 = new Class466(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method22419();
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22423();
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22428();
		} else if (Interface6.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface6 local48 = (Interface6) local11.getDeclaredConstructor().newInstance();
				local48.method13862(arg0);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class108 local70 = (Class108) this.method18261(local3);
		return local70.method7437() && local70.aClass519_6.method30311() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "am", descriptor = "(Lclient!alw;Lclient!qa;)Lclient!on;", line = 90)
	public Class466 method1472(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class500 arg1) {
		@Pc(3) int local3 = arg0.method22415();
		@Pc(8) Class466 local8 = new Class466(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method22419();
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22423();
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22428();
		} else if (Interface6.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface6 local48 = (Interface6) local11.getDeclaredConstructor().newInstance();
				local48.method13862(arg0);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class108 local70 = (Class108) this.method18261(local3);
		return local70.method7437() && local70.aClass519_6.method30311() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "au", descriptor = "(Lclient!alw;Lclient!qa;)Lclient!on;", line = 90)
	public Class466 method1473(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class500 arg1) {
		@Pc(3) int local3 = arg0.method22415();
		@Pc(8) Class466 local8 = new Class466(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method22419();
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22423();
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22428();
		} else if (Interface6.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface6 local48 = (Interface6) local11.getDeclaredConstructor().newInstance();
				local48.method13862(arg0);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class108 local70 = (Class108) this.method18261(local3);
		return local70.method7437() && local70.aClass519_6.method30311() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "m", descriptor = "(I)Lclient!ay;")
	public abstract Interface13 method18264(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!add", name = "k", descriptor = "(I)Lclient!ay;")
	public abstract Interface13 method18265(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!add", name = "e", descriptor = "(II)Lclient!ay;")
	public abstract Interface13 method18261(@OriginalArg(0) int arg0);
}
