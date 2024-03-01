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

@OriginalClass("client!xf")
public class Class574 {

	@OriginalMember(owner = "client!xf", name = "l", descriptor = "I")
	int anInt5426;

	@OriginalMember(owner = "client!xf", name = "p", descriptor = "C")
	public char aChar13;

	@OriginalMember(owner = "client!xf", name = "h", descriptor = "Ljava/util/Map;")
	Map aMap17;

	@OriginalMember(owner = "client!xf", name = "u", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap10;

	@OriginalMember(owner = "client!xf", name = "a", descriptor = "C")
	public char aChar14;

	@OriginalMember(owner = "client!xf", name = "x", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray43;

	@OriginalMember(owner = "client!xf", name = "g", descriptor = "Ljava/lang/String;")
	String aString240 = "null";

	@OriginalMember(owner = "client!xf", name = "s", descriptor = "I")
	int anInt5427 = 0;

	@OriginalMember(owner = "client!xf", name = "p", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", line = 11)
	public static final boolean method33111(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!xf", name = "<init>", descriptor = "()V", line = 18)
	Class574() {
	}

	@OriginalMember(owner = "client!xf", name = "p", descriptor = "(Lclient!ahb;I)V", line = 22)
	void method33082(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33080(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xf", name = "z", descriptor = "(Lclient!ahb;)V", line = 22)
	void method33083(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33080(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xf", name = "b", descriptor = "(Lclient!ahb;)V", line = 22)
	void method33088(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33080(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xf", name = "j", descriptor = "(Lclient!ahb;)V", line = 22)
	void method33091(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33080(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xf", name = "c", descriptor = "(Lclient!ahb;)V", line = 22)
	void method33102(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33080(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xf", name = "a", descriptor = "(Lclient!ahb;II)V", line = 29)
	void method33080(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar13 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 2) {
			this.aChar14 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 3) {
			this.aString240 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5426 = arg0.method20275() * -1910478917;
		} else {
			@Pc(65) int local65;
			@Pc(75) int local75;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt5427 = arg0.method20271() * -993637355;
				this.aMap17 = new HashMap(this.anInt5427 * 1077224253);
				for (local65 = 0; local65 < this.anInt5427 * 1077224253; local65++) {
					local75 = arg0.method20275();
					@Pc(82) Object local82;
					if (arg1 == 5) {
						local82 = arg0.method20283();
					} else {
						local82 = Integer.valueOf(arg0.method20275());
					}
					this.aMap17.put(Integer.valueOf(local75), local82);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local65 = arg0.method20271();
				this.anInt5427 = arg0.method20271() * -993637355;
				this.anObjectArray43 = new Object[local65];
				for (local75 = 0; local75 < this.anInt5427 * 1077224253; local75++) {
					@Pc(135) int local135 = arg0.method20271();
					if (arg1 == 7) {
						this.anObjectArray43[local135] = arg0.method20283();
					} else {
						this.anObjectArray43[local135] = Integer.valueOf(arg0.method20275());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xf", name = "n", descriptor = "(Lclient!ahb;I)V", line = 29)
	void method33092(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar13 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 2) {
			this.aChar14 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 3) {
			this.aString240 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5426 = arg0.method20275() * -1910478917;
		} else {
			@Pc(65) int local65;
			@Pc(75) int local75;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt5427 = arg0.method20271() * -993637355;
				this.aMap17 = new HashMap(this.anInt5427 * 1077224253);
				for (local65 = 0; local65 < this.anInt5427 * 1077224253; local65++) {
					local75 = arg0.method20275();
					@Pc(82) Object local82;
					if (arg1 == 5) {
						local82 = arg0.method20283();
					} else {
						local82 = Integer.valueOf(arg0.method20275());
					}
					this.aMap17.put(Integer.valueOf(local75), local82);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local65 = arg0.method20271();
				this.anInt5427 = arg0.method20271() * -993637355;
				this.anObjectArray43 = new Object[local65];
				for (local75 = 0; local75 < this.anInt5427 * 1077224253; local75++) {
					@Pc(135) int local135 = arg0.method20271();
					if (arg1 == 7) {
						this.anObjectArray43[local135] = arg0.method20283();
					} else {
						this.anObjectArray43[local135] = Integer.valueOf(arg0.method20275());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xf", name = "e", descriptor = "(Lclient!ahb;I)V", line = 29)
	void method33093(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar13 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 2) {
			this.aChar14 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 3) {
			this.aString240 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5426 = arg0.method20275() * -1910478917;
		} else {
			@Pc(65) int local65;
			@Pc(75) int local75;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt5427 = arg0.method20271() * -993637355;
				this.aMap17 = new HashMap(this.anInt5427 * 1077224253);
				for (local65 = 0; local65 < this.anInt5427 * 1077224253; local65++) {
					local75 = arg0.method20275();
					@Pc(82) Object local82;
					if (arg1 == 5) {
						local82 = arg0.method20283();
					} else {
						local82 = Integer.valueOf(arg0.method20275());
					}
					this.aMap17.put(Integer.valueOf(local75), local82);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local65 = arg0.method20271();
				this.anInt5427 = arg0.method20271() * -993637355;
				this.anObjectArray43 = new Object[local65];
				for (local75 = 0; local75 < this.anInt5427 * 1077224253; local75++) {
					@Pc(135) int local135 = arg0.method20271();
					if (arg1 == 7) {
						this.anObjectArray43[local135] = arg0.method20283();
					} else {
						this.anObjectArray43[local135] = Integer.valueOf(arg0.method20275());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xf", name = "q", descriptor = "(I)I", line = 58)
	public int method33079(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.anInt5426 * -1263254157 : (Integer) local4;
	}

	@OriginalMember(owner = "client!xf", name = "g", descriptor = "(IS)I", line = 58)
	public int method33089(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.anInt5426 * -1263254157 : (Integer) local4;
	}

	@OriginalMember(owner = "client!xf", name = "d", descriptor = "(I)I", line = 58)
	public int method33090(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.anInt5426 * -1263254157 : (Integer) local4;
	}

	@OriginalMember(owner = "client!xf", name = "r", descriptor = "(I)I", line = 58)
	public int method33094(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.anInt5426 * -1263254157 : (Integer) local4;
	}

	@OriginalMember(owner = "client!xf", name = "m", descriptor = "(I)Ljava/lang/String;", line = 64)
	public String method33096(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.aString240 : (String) local4;
	}

	@OriginalMember(owner = "client!xf", name = "l", descriptor = "(IB)Ljava/lang/String;", line = 64)
	public String method33097(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.aString240 : (String) local4;
	}

	@OriginalMember(owner = "client!xf", name = "v", descriptor = "(I)Ljava/lang/String;", line = 64)
	public String method33098(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.aString240 : (String) local4;
	}

	@OriginalMember(owner = "client!xf", name = "t", descriptor = "(I)Ljava/lang/String;", line = 64)
	public String method33099(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.aString240 : (String) local4;
	}

	@OriginalMember(owner = "client!xf", name = "w", descriptor = "(I)Ljava/lang/String;", line = 64)
	public String method33100(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method33108(arg0);
		return local4 == null ? this.aString240 : (String) local4;
	}

	@OriginalMember(owner = "client!xf", name = "i", descriptor = "(I)Ljava/lang/Object;", line = 70)
	Object method33078(@OriginalArg(0) int arg0) {
		if (this.anObjectArray43 == null) {
			return this.aMap17 == null ? null : this.aMap17.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray43.length) {
			return this.anObjectArray43[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!xf", name = "k", descriptor = "(I)Ljava/lang/Object;", line = 70)
	Object method33095(@OriginalArg(0) int arg0) {
		if (this.anObjectArray43 == null) {
			return this.aMap17 == null ? null : this.aMap17.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray43.length) {
			return this.anObjectArray43[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!xf", name = "o", descriptor = "(I)Ljava/lang/Object;", line = 70)
	Object method33101(@OriginalArg(0) int arg0) {
		if (this.anObjectArray43 == null) {
			return this.aMap17 == null ? null : this.aMap17.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray43.length) {
			return this.anObjectArray43[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!xf", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 70)
	Object method33103(@OriginalArg(0) int arg0) {
		if (this.anObjectArray43 == null) {
			return this.aMap17 == null ? null : this.aMap17.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray43.length) {
			return this.anObjectArray43[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!xf", name = "h", descriptor = "(II)Ljava/lang/Object;", line = 70)
	Object method33108(@OriginalArg(0) int arg0) {
		if (this.anObjectArray43 == null) {
			return this.aMap17 == null ? null : this.aMap17.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray43.length) {
			return this.anObjectArray43[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!xf", name = "x", descriptor = "(Ljava/lang/Object;B)Z", line = 79)
	public boolean method33084(@OriginalArg(0) Object arg0) {
		if (this.anInt5427 * 1077224253 == 0) {
			return false;
		} else {
			if (this.aHashMap10 == null) {
				this.method33087();
			}
			return this.aHashMap10.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!xf", name = "s", descriptor = "(Ljava/lang/Object;I)[I", line = 85)
	public int[] method33085(@OriginalArg(0) Object arg0) {
		if (this.anInt5427 * 1077224253 == 0) {
			return null;
		} else {
			if (this.aHashMap10 == null) {
				this.method33087();
			}
			return (int[]) this.aHashMap10.get(arg0);
		}
	}

	@OriginalMember(owner = "client!xf", name = "at", descriptor = "(Ljava/lang/Object;)[I", line = 85)
	public int[] method33104(@OriginalArg(0) Object arg0) {
		if (this.anInt5427 * 1077224253 == 0) {
			return null;
		} else {
			if (this.aHashMap10 == null) {
				this.method33087();
			}
			return (int[]) this.aHashMap10.get(arg0);
		}
	}

	@OriginalMember(owner = "client!xf", name = "u", descriptor = "(B)I", line = 91)
	public int method33086() {
		return this.anInt5427 * 1077224253;
	}

	@OriginalMember(owner = "client!xf", name = "af", descriptor = "()I", line = 91)
	public int method33105() {
		return this.anInt5427 * 1077224253;
	}

	@OriginalMember(owner = "client!xf", name = "ak", descriptor = "()I", line = 91)
	public int method33106() {
		return this.anInt5427 * 1077224253;
	}

	@OriginalMember(owner = "client!xf", name = "ah", descriptor = "()V", line = 95)
	void method33081() {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(29) List local29;
		@Pc(58) Iterator local58;
		@Pc(65) Entry local65;
		if (this.anObjectArray43 == null) {
			if (this.aMap17 == null) {
				throw new IllegalStateException();
			}
			local58 = this.aMap17.entrySet().iterator();
			while (local58.hasNext()) {
				local65 = (Entry) local58.next();
				@Pc(68) Object local68 = local65.getValue();
				@Pc(73) List local73 = (List) local3.get(local68);
				if (local73 == null) {
					local73 = new LinkedList();
					local3.put(local68, local73);
				}
				local73.add(local65.getKey());
			}
		} else {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArray43.length; local8++) {
				if (this.anObjectArray43[local8] != null) {
					@Pc(24) Object local24 = this.anObjectArray43[local8];
					local29 = (List) local3.get(local24);
					if (local29 == null) {
						local29 = new LinkedList();
						local3.put(local24, local29);
					}
					local29.add(Integer.valueOf(local8));
				}
			}
		}
		this.aHashMap10 = new HashMap();
		local58 = local3.entrySet().iterator();
		while (local58.hasNext()) {
			local65 = (Entry) local58.next();
			local29 = (List) local65.getValue();
			@Pc(119) int[] local119 = new int[local29.size()];
			@Pc(121) int local121 = 0;
			@Pc(124) Iterator local124 = local29.iterator();
			while (local124.hasNext()) {
				@Pc(131) Integer local131 = (Integer) local124.next();
				local119[local121++] = local131;
			}
			if (this.anObjectArray43 == null) {
				Arrays.sort(local119);
			}
			this.aHashMap10.put(local65.getKey(), local119);
		}
	}

	@OriginalMember(owner = "client!xf", name = "y", descriptor = "(I)V", line = 95)
	void method33087() {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(29) List local29;
		@Pc(58) Iterator local58;
		@Pc(65) Entry local65;
		if (this.anObjectArray43 == null) {
			if (this.aMap17 == null) {
				throw new IllegalStateException();
			}
			local58 = this.aMap17.entrySet().iterator();
			while (local58.hasNext()) {
				local65 = (Entry) local58.next();
				@Pc(68) Object local68 = local65.getValue();
				@Pc(73) List local73 = (List) local3.get(local68);
				if (local73 == null) {
					local73 = new LinkedList();
					local3.put(local68, local73);
				}
				local73.add(local65.getKey());
			}
		} else {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArray43.length; local8++) {
				if (this.anObjectArray43[local8] != null) {
					@Pc(24) Object local24 = this.anObjectArray43[local8];
					local29 = (List) local3.get(local24);
					if (local29 == null) {
						local29 = new LinkedList();
						local3.put(local24, local29);
					}
					local29.add(Integer.valueOf(local8));
				}
			}
		}
		this.aHashMap10 = new HashMap();
		local58 = local3.entrySet().iterator();
		while (local58.hasNext()) {
			local65 = (Entry) local58.next();
			local29 = (List) local65.getValue();
			@Pc(119) int[] local119 = new int[local29.size()];
			@Pc(121) int local121 = 0;
			@Pc(124) Iterator local124 = local29.iterator();
			while (local124.hasNext()) {
				@Pc(131) Integer local131 = (Integer) local124.next();
				local119[local121++] = local131;
			}
			if (this.anObjectArray43 == null) {
				Arrays.sort(local119);
			}
			this.aHashMap10.put(local65.getKey(), local119);
		}
	}

	@OriginalMember(owner = "client!xf", name = "aa", descriptor = "()V", line = 95)
	void method33107() {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(29) List local29;
		@Pc(58) Iterator local58;
		@Pc(65) Entry local65;
		if (this.anObjectArray43 == null) {
			if (this.aMap17 == null) {
				throw new IllegalStateException();
			}
			local58 = this.aMap17.entrySet().iterator();
			while (local58.hasNext()) {
				local65 = (Entry) local58.next();
				@Pc(68) Object local68 = local65.getValue();
				@Pc(73) List local73 = (List) local3.get(local68);
				if (local73 == null) {
					local73 = new LinkedList();
					local3.put(local68, local73);
				}
				local73.add(local65.getKey());
			}
		} else {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArray43.length; local8++) {
				if (this.anObjectArray43[local8] != null) {
					@Pc(24) Object local24 = this.anObjectArray43[local8];
					local29 = (List) local3.get(local24);
					if (local29 == null) {
						local29 = new LinkedList();
						local3.put(local24, local29);
					}
					local29.add(Integer.valueOf(local8));
				}
			}
		}
		this.aHashMap10 = new HashMap();
		local58 = local3.entrySet().iterator();
		while (local58.hasNext()) {
			local65 = (Entry) local58.next();
			local29 = (List) local65.getValue();
			@Pc(119) int[] local119 = new int[local29.size()];
			@Pc(121) int local121 = 0;
			@Pc(124) Iterator local124 = local29.iterator();
			while (local124.hasNext()) {
				@Pc(131) Integer local131 = (Integer) local124.next();
				local119[local121++] = local131;
			}
			if (this.anObjectArray43 == null) {
				Arrays.sort(local119);
			}
			this.aHashMap10.put(local65.getKey(), local119);
		}
	}

	@OriginalMember(owner = "client!xf", name = "k", descriptor = "(III)I", line = 1619)
	static final int method33109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg1 * 57 + arg0;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!xf", name = "hs", descriptor = "(Lclient!vs;B)V", line = 5416)
	static final void method33110(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class174.method23395(local11, local14, false, 1, arg0);
	}
}
