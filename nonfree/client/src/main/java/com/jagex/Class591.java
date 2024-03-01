package com.jagex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xy")
public class Class591 implements Interface58 {

	@OriginalMember(owner = "client!xy", name = "p", descriptor = "Ljava/util/Map;")
	Map aMap18;

	@OriginalMember(owner = "client!xy", name = "a", descriptor = "Lclient!ma;")
	final Interface37 anInterface37_1;

	@OriginalMember(owner = "client!xy", name = "<init>", descriptor = "(Lclient!ma;)V", line = 11)
	public Class591(@OriginalArg(0) Interface37 arg0) {
		this.anInterface37_1 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "p", descriptor = "(IS)I", line = 16)
	@Override
	public int method33322(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			@Pc(9) Class304 local9 = (Class304) this.aMap18.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject17;
			}
		}
		return (Integer) this.anInterface37_1.method14712(arg0);
	}

	@OriginalMember(owner = "client!xy", name = "z", descriptor = "(I)I", line = 16)
	@Override
	public int method33323(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			@Pc(9) Class304 local9 = (Class304) this.aMap18.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject17;
			}
		}
		return (Integer) this.anInterface37_1.method14712(arg0);
	}

	@OriginalMember(owner = "client!xy", name = "a", descriptor = "(III)V", line = 24)
	@Override
	public void method33305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "j", descriptor = "(II)V", line = 24)
	@Override
	public void method33314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "n", descriptor = "(II)V", line = 24)
	@Override
	public void method33306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "g", descriptor = "(IB)J", line = 36)
	@Override
	public long method33307(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			@Pc(10) Class304 local10 = (Class304) this.aMap18.get(arg0);
			if (local10 != null) {
				return (Long) local10.anObject17;
			}
		}
		return (Long) this.anInterface37_1.method14712(arg0);
	}

	@OriginalMember(owner = "client!xy", name = "e", descriptor = "(I)J", line = 36)
	@Override
	public long method33316(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			@Pc(10) Class304 local10 = (Class304) this.aMap18.get(arg0);
			if (local10 != null) {
				return (Long) local10.anObject17;
			}
		}
		return (Long) this.anInterface37_1.method14712(arg0);
	}

	@OriginalMember(owner = "client!xy", name = "d", descriptor = "(IJ)V", line = 44)
	@Override
	public void method33318(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "s", descriptor = "(IJ)V", line = 44)
	@Override
	public void method33308(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "r", descriptor = "(IJ)V", line = 44)
	@Override
	public void method33317(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "q", descriptor = "(IJ)V", line = 44)
	@Override
	public void method33319(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "u", descriptor = "(IB)Ljava/lang/Object;", line = 56)
	@Override
	public Object method33311(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			@Pc(9) Class304 local9 = (Class304) this.aMap18.get(arg0);
			if (local9 != null) {
				return local9.anObject17;
			}
		}
		return this.anInterface37_1.method14712(arg0);
	}

	@OriginalMember(owner = "client!xy", name = "m", descriptor = "(I)Ljava/lang/Object;", line = 56)
	@Override
	public Object method33315(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			@Pc(9) Class304 local9 = (Class304) this.aMap18.get(arg0);
			if (local9 != null) {
				return local9.anObject17;
			}
		}
		return this.anInterface37_1.method14712(arg0);
	}

	@OriginalMember(owner = "client!xy", name = "u", descriptor = "(II)Z", line = 56)
	public static boolean method33335(@OriginalArg(0) int arg0) {
		return arg0 >= Class456.aClass456_12.anInt5061 * 821735799 && arg0 <= Class456.aClass456_20.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!xy", name = "y", descriptor = "(ILjava/lang/Object;B)V", line = 64)
	@Override
	public void method33310(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "v", descriptor = "(ILjava/lang/Object;)V", line = 64)
	@Override
	public void method33321(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "t", descriptor = "(ILjava/lang/Object;)V", line = 64)
	@Override
	public void method33309(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap18 == null) {
			this.aMap18 = new HashMap();
			this.aMap18.put(arg0, new Class304(arg0, arg1));
			return;
		}
		@Pc(27) Class304 local27 = (Class304) this.aMap18.get(arg0);
		if (local27 == null) {
			this.aMap18.put(arg0, new Class304(arg0, arg1));
		} else {
			local27.anObject17 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "k", descriptor = "()V", line = 76)
	@Override
	public void method33327() {
		if (this.aMap18 != null) {
			this.aMap18.clear();
		}
	}

	@OriginalMember(owner = "client!xy", name = "b", descriptor = "(I)V", line = 76)
	@Override
	public void method33320() {
		if (this.aMap18 != null) {
			this.aMap18.clear();
		}
	}

	@OriginalMember(owner = "client!xy", name = "f", descriptor = "()V", line = 76)
	@Override
	public void method33313() {
		if (this.aMap18 != null) {
			this.aMap18.clear();
		}
	}

	@OriginalMember(owner = "client!xy", name = "o", descriptor = "(I)V", line = 80)
	@Override
	public void method33324(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			this.aMap18.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!xy", name = "c", descriptor = "(II)V", line = 80)
	@Override
	public void method33312(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			this.aMap18.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!xy", name = "w", descriptor = "(I)V", line = 80)
	@Override
	public void method33326(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			this.aMap18.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!xy", name = "i", descriptor = "(I)V", line = 80)
	@Override
	public void method33325(@OriginalArg(0) int arg0) {
		if (this.aMap18 != null) {
			this.aMap18.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!xy", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 84)
	@Override
	public Iterator iterator() {
		return this.aMap18 == null ? Collections.emptyList().iterator() : this.aMap18.values().iterator();
	}

	@OriginalMember(owner = "client!xy", name = "h", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method33328() {
		return this.aMap18 == null ? Collections.emptyList().iterator() : this.aMap18.values().iterator();
	}

	@OriginalMember(owner = "client!xy", name = "x", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method33329() {
		return this.aMap18 == null ? Collections.emptyList().iterator() : this.aMap18.values().iterator();
	}

	@OriginalMember(owner = "client!xy", name = "l", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method33330() {
		return this.aMap18 == null ? Collections.emptyList().iterator() : this.aMap18.values().iterator();
	}

	@OriginalMember(owner = "client!xy", name = "df", descriptor = "(I)V", line = 289)
	static void method33333() {
		Class473.method28782();
		Class58_Sub1.aClass3_Sub1_Sub4_2 = null;
		Class179.aClass3_Sub1_Sub4_3 = null;
		Class58_Sub1.aClass581_14.method33222();
		Class58_Sub1.aClass581_15.method33222();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				Class58_Sub1.aClass14ArrayArray1[local13][local18] = null;
				Class58_Sub1.aClass611ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!xy", name = "dz", descriptor = "(ZI)V", line = 716)
	static void method33334(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class464 local3 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16663();
		@Pc(13) Class3_Sub1_Sub4 local13 = Class58_Sub1.method12460(local3.anInt5071 * -1567811631, local3.anInt5073 * 1360175441);
		if (local13 == null) {
			local13 = Class58_Sub1.method12390(Class58_Sub1.aClass484_2.anInt5176 * 1068120557);
		}
		if (Class179.aClass3_Sub1_Sub4_3 == local13 && !arg0) {
			return;
		}
		Class179.aClass3_Sub1_Sub4_3 = local13;
		@Pc(32) boolean local32 = Class58_Sub1.method12436(local13);
		if (local32) {
			Class58_Sub1.aBoolean315 = true;
			Class473.method28782();
		}
	}

	@OriginalMember(owner = "client!xy", name = "tx", descriptor = "(Lclient!vs;I)V", line = 7629)
	static final void method33332(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		Class510.aClass183_1.method23573(arg0.anIntArray496[arg0.anInt5319 * 960738381], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]);
	}

	@OriginalMember(owner = "client!xy", name = "uz", descriptor = "(Lclient!vs;I)V", line = 7804)
	static final void method33331(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass106_7.method21910();
	}

	@OriginalMember(owner = "client!xy", name = "mk", descriptor = "(Ljava/lang/String;B)V", line = 11444)
	public static final void method33336(@OriginalArg(0) String arg0) {
		@Pc(5) int local5 = client.aBoolean584 ? 400 : 200;
		if (arg0 == null) {
			return;
		}
		if (client.anInt3042 * -1645830611 >= local5) {
			Class544.method32611(4, client.aBoolean584 ? Class601.aClass601_40.method33512(Class469.aClass530_2) : Class601.aClass601_41.method33512(Class469.aClass530_2));
			return;
		}
		@Pc(34) String local34 = Class65_Sub1.method13183(arg0, Class141.aClass623_1);
		if (local34 == null) {
			return;
		}
		@Pc(40) int local40;
		@Pc(55) String local55;
		@Pc(85) String local85;
		for (local40 = 0; local40 < client.anInt3042 * -1645830611; local40++) {
			@Pc(49) Class313 local49 = client.aClass313Array1[local40];
			local55 = Class65_Sub1.method13183(local49.aString202, Class141.aClass623_1);
			if (local55 != null && local55.equals(local34)) {
				Class544.method32611(4, arg0 + Class601.aClass601_150.method33512(Class469.aClass530_2));
				return;
			}
			if (local49.aString200 != null) {
				local85 = Class65_Sub1.method13183(local49.aString200, Class141.aClass623_1);
				if (local85 != null && local85.equals(local34)) {
					Class544.method32611(4, arg0 + Class601.aClass601_150.method33512(Class469.aClass530_2));
					return;
				}
			}
		}
		for (local40 = 0; local40 < client.anInt3174 * 918731051; local40++) {
			@Pc(119) Class123 local119 = client.aClass123Array1[local40];
			local55 = Class65_Sub1.method13183(local119.aString161, Class141.aClass623_1);
			if (local55 != null && local55.equals(local34)) {
				Class544.method32611(4, Class601.aClass601_42.method33512(Class469.aClass530_2) + arg0 + Class601.aClass601_158.method33512(Class469.aClass530_2));
				return;
			}
			if (local119.aString159 != null) {
				local85 = Class65_Sub1.method13183(local119.aString159, Class141.aClass623_1);
				if (local85 != null && local85.equals(local34)) {
					Class544.method32611(4, Class601.aClass601_42.method33512(Class469.aClass530_2) + arg0 + Class601.aClass601_158.method33512(Class469.aClass530_2));
					return;
				}
			}
		}
		if (Class65_Sub1.method13183(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75, Class141.aClass623_1).equals(local34)) {
			Class544.method32611(4, Class601.aClass601_136.method33512(Class469.aClass530_2));
			return;
		}
		@Pc(210) Class82 local210 = Class406.method27657();
		@Pc(216) Class3_Sub23 local216 = Class269.method25284(Class311.aClass311_88, local210.aClass577_2);
		local216.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0));
		local216.aClass3_Sub41_Sub1_1.method20260(arg0);
		local210.method21601(local216);
	}
}
