package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abl")
public class Class36 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!abl", name = "c", descriptor = "Lclient!qu;")
	public Class498 aClass498_1;

	@OriginalMember(owner = "client!abl", name = "y", descriptor = "Ljava/util/Map;")
	Map aMap2;

	@OriginalMember(owner = "client!abl", name = "l", descriptor = "I")
	int anInt134;

	@OriginalMember(owner = "client!abl", name = "p", descriptor = "Lclient!qu;")
	public Class498 aClass498_2;

	@OriginalMember(owner = "client!abl", name = "w", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray1;

	@OriginalMember(owner = "client!abl", name = "q", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap1;

	@OriginalMember(owner = "client!abl", name = "v", descriptor = "Ljava/lang/String;")
	String aString7 = "null";

	@OriginalMember(owner = "client!abl", name = "t", descriptor = "I")
	int anInt135 = 0;

	@OriginalMember(owner = "client!abl", name = "<init>", descriptor = "()V", line = 23)
	Class36() {
	}

	@OriginalMember(owner = "client!abl", name = "p", descriptor = "(Lclient!akv;B)V", line = 27)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method618(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!abl", name = "l", descriptor = "(Lclient!akv;)V", line = 27)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method618(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!abl", name = "v", descriptor = "(Lclient!akv;)V", line = 27)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method618(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!abl", name = "y", descriptor = "(Lclient!akv;)V", line = 27)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method618(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!abl", name = "q", descriptor = "(Lclient!akv;IB)V", line = 34)
	void method618(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) char local8;
		if (arg1 == 1) {
			local8 = Class125_Sub2.method12705(arg0.method22481());
			this.aClass498_2 = Class498.method30196(local8);
		} else if (arg1 == 2) {
			local8 = Class125_Sub2.method12705(arg0.method22481());
			this.aClass498_1 = Class498.method30196(local8);
		} else if (arg1 == 3) {
			this.aString7 = arg0.method22523();
		} else if (arg1 == 4) {
			this.anInt134 = arg0.method22500() * -296170141;
		} else {
			@Pc(83) int local83;
			@Pc(73) int local73;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt135 = arg0.method22483() * 1428784925;
				this.aMap2 = new HashMap(this.anInt135 * 578384693);
				for (local73 = 0; local73 < this.anInt135 * 578384693; local73++) {
					local83 = arg0.method22500();
					@Pc(90) Object local90;
					if (arg1 == 5) {
						local90 = arg0.method22523();
					} else {
						local90 = Integer.valueOf(arg0.method22500());
					}
					this.aMap2.put(Integer.valueOf(local83), local90);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local73 = arg0.method22483();
				this.anInt135 = arg0.method22483() * 1428784925;
				this.anObjectArray1 = new Object[local73];
				for (local83 = 0; local83 < this.anInt135 * 578384693; local83++) {
					@Pc(143) int local143 = arg0.method22483();
					if (arg1 == 7) {
						this.anObjectArray1[local143] = arg0.method22523();
					} else {
						this.anObjectArray1[local143] = Integer.valueOf(arg0.method22500());
					}
				}
			} else if (arg1 == 101) {
				this.aClass498_2 = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
			} else if (arg1 == 102) {
				this.aClass498_1 = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
			}
		}
	}

	@OriginalMember(owner = "client!abl", name = "e", descriptor = "(Lclient!akv;I)V", line = 34)
	void method619(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) char local8;
		if (arg1 == 1) {
			local8 = Class125_Sub2.method12705(arg0.method22481());
			this.aClass498_2 = Class498.method30196(local8);
		} else if (arg1 == 2) {
			local8 = Class125_Sub2.method12705(arg0.method22481());
			this.aClass498_1 = Class498.method30196(local8);
		} else if (arg1 == 3) {
			this.aString7 = arg0.method22523();
		} else if (arg1 == 4) {
			this.anInt134 = arg0.method22500() * -296170141;
		} else {
			@Pc(83) int local83;
			@Pc(73) int local73;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt135 = arg0.method22483() * 1428784925;
				this.aMap2 = new HashMap(this.anInt135 * 578384693);
				for (local73 = 0; local73 < this.anInt135 * 578384693; local73++) {
					local83 = arg0.method22500();
					@Pc(90) Object local90;
					if (arg1 == 5) {
						local90 = arg0.method22523();
					} else {
						local90 = Integer.valueOf(arg0.method22500());
					}
					this.aMap2.put(Integer.valueOf(local83), local90);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local73 = arg0.method22483();
				this.anInt135 = arg0.method22483() * 1428784925;
				this.anObjectArray1 = new Object[local73];
				for (local83 = 0; local83 < this.anInt135 * 578384693; local83++) {
					@Pc(143) int local143 = arg0.method22483();
					if (arg1 == 7) {
						this.anObjectArray1[local143] = arg0.method22523();
					} else {
						this.anObjectArray1[local143] = Integer.valueOf(arg0.method22500());
					}
				}
			} else if (arg1 == 101) {
				this.aClass498_2 = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
			} else if (arg1 == 102) {
				this.aClass498_1 = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
			}
		}
	}

	@OriginalMember(owner = "client!abl", name = "d", descriptor = "(II)I", line = 75)
	public int method620(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method626(arg0);
		return local4 == null ? this.anInt134 * -101245877 : (Integer) local4;
	}

	@OriginalMember(owner = "client!abl", name = "f", descriptor = "(I)I", line = 75)
	public int method621(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method626(arg0);
		return local4 == null ? this.anInt134 * -101245877 : (Integer) local4;
	}

	@OriginalMember(owner = "client!abl", name = "o", descriptor = "(I)I", line = 75)
	public int method622(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method626(arg0);
		return local4 == null ? this.anInt134 * -101245877 : (Integer) local4;
	}

	@OriginalMember(owner = "client!abl", name = "b", descriptor = "(I)I", line = 75)
	public int method623(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method626(arg0);
		return local4 == null ? this.anInt134 * -101245877 : (Integer) local4;
	}

	@OriginalMember(owner = "client!abl", name = "s", descriptor = "(IB)Ljava/lang/String;", line = 81)
	public String method624(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method626(arg0);
		return local4 == null ? this.aString7 : (String) local4;
	}

	@OriginalMember(owner = "client!abl", name = "n", descriptor = "(I)Ljava/lang/String;", line = 81)
	public String method625(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method626(arg0);
		return local4 == null ? this.aString7 : (String) local4;
	}

	@OriginalMember(owner = "client!abl", name = "r", descriptor = "(II)Ljava/lang/Object;", line = 87)
	Object method626(@OriginalArg(0) int arg0) {
		if (this.anObjectArray1 == null) {
			return this.aMap2 == null ? null : this.aMap2.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray1.length) {
			return this.anObjectArray1[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!abl", name = "m", descriptor = "(Ljava/lang/Object;)Z", line = 96)
	public boolean method627(@OriginalArg(0) Object arg0) {
		if (this.anInt135 * 578384693 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method640();
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abl", name = "j", descriptor = "(Ljava/lang/Object;B)Z", line = 96)
	public boolean method628(@OriginalArg(0) Object arg0) {
		if (this.anInt135 * 578384693 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method640();
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abl", name = "a", descriptor = "(Ljava/lang/Object;)Z", line = 96)
	public boolean method629(@OriginalArg(0) Object arg0) {
		if (this.anInt135 * 578384693 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method640();
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abl", name = "h", descriptor = "(Ljava/lang/Object;)Z", line = 96)
	public boolean method630(@OriginalArg(0) Object arg0) {
		if (this.anInt135 * 578384693 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method640();
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abl", name = "i", descriptor = "(Ljava/lang/Object;S)[I", line = 102)
	public int[] method631(@OriginalArg(0) Object arg0) {
		if (this.anInt135 * 578384693 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method640();
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abl", name = "aj", descriptor = "(Ljava/lang/Object;)[I", line = 102)
	public int[] method632(@OriginalArg(0) Object arg0) {
		if (this.anInt135 * 578384693 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method640();
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abl", name = "ai", descriptor = "(Ljava/lang/Object;)[I", line = 102)
	public int[] method633(@OriginalArg(0) Object arg0) {
		if (this.anInt135 * 578384693 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method640();
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abl", name = "ag", descriptor = "(Ljava/lang/Object;)[I", line = 102)
	public int[] method634(@OriginalArg(0) Object arg0) {
		if (this.anInt135 * 578384693 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method640();
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abl", name = "k", descriptor = "(I)I", line = 108)
	public int method635() {
		return this.anInt135 * 578384693;
	}

	@OriginalMember(owner = "client!abl", name = "al", descriptor = "()I", line = 108)
	public int method636() {
		return this.anInt135 * 578384693;
	}

	@OriginalMember(owner = "client!abl", name = "ao", descriptor = "()I", line = 108)
	public int method637() {
		return this.anInt135 * 578384693;
	}

	@OriginalMember(owner = "client!abl", name = "au", descriptor = "()V", line = 112)
	void method638() {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(30) List local30;
		@Pc(60) Iterator local60;
		@Pc(67) Entry local67;
		if (this.anObjectArray1 == null) {
			if (this.aMap2 == null) {
				throw new IllegalStateException();
			}
			local60 = this.aMap2.entrySet().iterator();
			while (local60.hasNext()) {
				local67 = (Entry) local60.next();
				@Pc(70) Object local70 = local67.getValue();
				@Pc(75) List local75 = (List) local3.get(local70);
				if (local75 == null) {
					local75 = new LinkedList();
					local3.put(local70, local75);
				}
				local75.add(local67.getKey());
			}
		} else {
			for (@Pc(9) int local9 = 0; local9 < this.anObjectArray1.length; local9++) {
				if (this.anObjectArray1[local9] != null) {
					@Pc(25) Object local25 = this.anObjectArray1[local9];
					local30 = (List) local3.get(local25);
					if (local30 == null) {
						local30 = new LinkedList();
						local3.put(local25, local30);
					}
					local30.add(Integer.valueOf(local9));
				}
			}
		}
		this.aHashMap1 = new HashMap();
		local60 = local3.entrySet().iterator();
		while (local60.hasNext()) {
			local67 = (Entry) local60.next();
			local30 = (List) local67.getValue();
			@Pc(122) int[] local122 = new int[local30.size()];
			@Pc(124) int local124 = 0;
			@Pc(127) Iterator local127 = local30.iterator();
			while (local127.hasNext()) {
				@Pc(134) Integer local134 = (Integer) local127.next();
				local122[local124++] = local134;
			}
			if (this.anObjectArray1 == null) {
				Arrays.sort(local122);
			}
			this.aHashMap1.put(local67.getKey(), local122);
		}
	}

	@OriginalMember(owner = "client!abl", name = "ak", descriptor = "()V", line = 112)
	void method639() {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(30) List local30;
		@Pc(60) Iterator local60;
		@Pc(67) Entry local67;
		if (this.anObjectArray1 == null) {
			if (this.aMap2 == null) {
				throw new IllegalStateException();
			}
			local60 = this.aMap2.entrySet().iterator();
			while (local60.hasNext()) {
				local67 = (Entry) local60.next();
				@Pc(70) Object local70 = local67.getValue();
				@Pc(75) List local75 = (List) local3.get(local70);
				if (local75 == null) {
					local75 = new LinkedList();
					local3.put(local70, local75);
				}
				local75.add(local67.getKey());
			}
		} else {
			for (@Pc(9) int local9 = 0; local9 < this.anObjectArray1.length; local9++) {
				if (this.anObjectArray1[local9] != null) {
					@Pc(25) Object local25 = this.anObjectArray1[local9];
					local30 = (List) local3.get(local25);
					if (local30 == null) {
						local30 = new LinkedList();
						local3.put(local25, local30);
					}
					local30.add(Integer.valueOf(local9));
				}
			}
		}
		this.aHashMap1 = new HashMap();
		local60 = local3.entrySet().iterator();
		while (local60.hasNext()) {
			local67 = (Entry) local60.next();
			local30 = (List) local67.getValue();
			@Pc(122) int[] local122 = new int[local30.size()];
			@Pc(124) int local124 = 0;
			@Pc(127) Iterator local127 = local30.iterator();
			while (local127.hasNext()) {
				@Pc(134) Integer local134 = (Integer) local127.next();
				local122[local124++] = local134;
			}
			if (this.anObjectArray1 == null) {
				Arrays.sort(local122);
			}
			this.aHashMap1.put(local67.getKey(), local122);
		}
	}

	@OriginalMember(owner = "client!abl", name = "u", descriptor = "(I)V", line = 112)
	void method640() {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(30) List local30;
		@Pc(60) Iterator local60;
		@Pc(67) Entry local67;
		if (this.anObjectArray1 == null) {
			if (this.aMap2 == null) {
				throw new IllegalStateException();
			}
			local60 = this.aMap2.entrySet().iterator();
			while (local60.hasNext()) {
				local67 = (Entry) local60.next();
				@Pc(70) Object local70 = local67.getValue();
				@Pc(75) List local75 = (List) local3.get(local70);
				if (local75 == null) {
					local75 = new LinkedList();
					local3.put(local70, local75);
				}
				local75.add(local67.getKey());
			}
		} else {
			for (@Pc(9) int local9 = 0; local9 < this.anObjectArray1.length; local9++) {
				if (this.anObjectArray1[local9] != null) {
					@Pc(25) Object local25 = this.anObjectArray1[local9];
					local30 = (List) local3.get(local25);
					if (local30 == null) {
						local30 = new LinkedList();
						local3.put(local25, local30);
					}
					local30.add(Integer.valueOf(local9));
				}
			}
		}
		this.aHashMap1 = new HashMap();
		local60 = local3.entrySet().iterator();
		while (local60.hasNext()) {
			local67 = (Entry) local60.next();
			local30 = (List) local67.getValue();
			@Pc(122) int[] local122 = new int[local30.size()];
			@Pc(124) int local124 = 0;
			@Pc(127) Iterator local127 = local30.iterator();
			while (local127.hasNext()) {
				@Pc(134) Integer local134 = (Integer) local127.next();
				local122[local124++] = local134;
			}
			if (this.anObjectArray1 == null) {
				Arrays.sort(local122);
			}
			this.aHashMap1.put(local67.getKey(), local122);
		}
	}

	@OriginalMember(owner = "client!abl", name = "c", descriptor = "(I)V", line = 161)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!abl", name = "w", descriptor = "()V", line = 161)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!abl", name = "t", descriptor = "()V", line = 161)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!abl", name = "x", descriptor = "(II)V", line = 162)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "z", descriptor = "(I)V", line = 162)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "g", descriptor = "(I)V", line = 162)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "s", descriptor = "(ILjava/lang/String;ZI)V", line = 188)
	public static void method641(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (!Class539.method30909()) {
			return;
		}
		if (Class589.anInt5459 * 1832109523 != arg0) {
			Class589.aLong290 = 8972729624098644529L;
		}
		Class589.anInt5459 = arg0 * 1651628635;
		Class589.aString235 = arg1;
		Class589.aBoolean813 = arg2;
		client.aClass82_1.method2014();
		Class668.method33179(13);
	}

	@OriginalMember(owner = "client!abl", name = "fn", descriptor = "(Lclient!yf;I)V", line = 5517)
	static final void method642(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class542.method30944(local16, local22, arg0);
	}
}
