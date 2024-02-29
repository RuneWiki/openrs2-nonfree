package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public class Class299 {

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
	static final int anInt4014 = 10;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljava/lang/String;")
	String aString187;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Z")
	boolean aBoolean691 = false;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList2 = new LinkedList();

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "(S)Z", line = 17)
	public boolean method27068() {
		return this.aBoolean691;
	}

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "()Z", line = 17)
	public boolean method27069() {
		return this.aBoolean691;
	}

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "()Z", line = 17)
	public boolean method27070() {
		return this.aBoolean691;
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "()Z", line = 17)
	public boolean method27071() {
		return this.aBoolean691;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(ZB)V", line = 21)
	public void method27072(@OriginalArg(0) boolean arg0) {
		this.aBoolean691 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "(Z)V", line = 21)
	public void method27073(@OriginalArg(0) boolean arg0) {
		this.aBoolean691 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "(Z)V", line = 21)
	public void method27074(@OriginalArg(0) boolean arg0) {
		this.aBoolean691 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "(Z)V", line = 21)
	public void method27075(@OriginalArg(0) boolean arg0) {
		this.aBoolean691 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "(Z)V", line = 21)
	public void method27076(@OriginalArg(0) boolean arg0) {
		this.aBoolean691 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "(I)I", line = 25)
	public int method27077() {
		return this.aLinkedList2.size();
	}

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "()I", line = 25)
	public int method27078() {
		return this.aLinkedList2.size();
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "()I", line = 25)
	public int method27079() {
		return this.aLinkedList2.size();
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "()I", line = 25)
	public int method27080() {
		return this.aLinkedList2.size();
	}

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "(C)Z", line = 29)
	public static final boolean method27081(@OriginalArg(0) char arg0) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 33)
	public final boolean method27082(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class330.method27593(arg0.charAt(0))) {
			return false;
		}
		@Pc(17) Class293 local17 = this.method27087(arg0);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class293(arg0, arg1, arg2));
		this.method27098();
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "(Ljava/lang/String;III)Z", line = 33)
	public final boolean method27083(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class330.method27593(arg0.charAt(0))) {
			return false;
		}
		@Pc(17) Class293 local17 = this.method27087(arg0);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class293(arg0, arg1, arg2));
		this.method27098();
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Ljava/lang/String;II)Z", line = 33)
	public final boolean method27084(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class330.method27593(arg0.charAt(0))) {
			return false;
		}
		@Pc(17) Class293 local17 = this.method27087(arg0);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class293(arg0, arg1, arg2));
		this.method27098();
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "(Ljava/lang/String;II)Z", line = 33)
	public final boolean method27085(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class330.method27593(arg0.charAt(0))) {
			return false;
		}
		@Pc(17) Class293 local17 = this.method27087(arg0);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class293(arg0, arg1, arg2));
		this.method27098();
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "(Lclient!yf;I)V", line = 33)
	static void method27086(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).anInt4054 * -1628667329;
	}

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "(Ljava/lang/String;I)Lclient!hb;", line = 46)
	final Class293 method27087(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class293 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class293) local3.next();
		} while (!local10.aString183.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "(Ljava/lang/String;)Lclient!hb;", line = 46)
	final Class293 method27088(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class293 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class293) local3.next();
		} while (!local10.aString183.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "(Ljava/lang/String;I)V", line = 57)
	public final void method27089(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class293 local10 = (Class293) local3.next();
			if (local10.aString183.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(Ljava/lang/String;)V", line = 57)
	public final void method27090(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class293 local10 = (Class293) local3.next();
			if (local10.aString183.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "aj", descriptor = "(Ljava/lang/String;)V", line = 57)
	public final void method27091(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class293 local10 = (Class293) local3.next();
			if (local10.aString183.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "ai", descriptor = "(Ljava/lang/String;)V", line = 57)
	public final void method27092(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class293 local10 = (Class293) local3.next();
			if (local10.aString183.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "(B)V", line = 68)
	public final void method27093() {
		this.aLinkedList2.clear();
		this.aString187 = "";
	}

	@OriginalMember(owner = "client!hh", name = "ag", descriptor = "()V", line = 68)
	public final void method27094() {
		this.aLinkedList2.clear();
		this.aString187 = "";
	}

	@OriginalMember(owner = "client!hh", name = "al", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 73)
	public final String method27095(@OriginalArg(0) String arg0) {
		if (this.aLinkedList2.isEmpty()) {
			return arg0;
		}
		@Pc(11) StringBuilder local11 = new StringBuilder(arg0.length());
		@Pc(14) int local14 = arg0.length();
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(23) boolean local23 = false;
			@Pc(27) char local27 = arg0.charAt(local18);
			if (local16) {
				if (local27 == '>') {
					local16 = false;
				}
			} else if (local27 == '<') {
				local16 = true;
			} else if (this.aString187.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class293 local60 = (Class293) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString183.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString183)) {
						@Pc(105) String local105;
						if (local60.anInt4010 * 484620447 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4009 * 2010221443, local60.anInt4010 * 484620447);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4009 * 2010221443);
						}
						local11.append(local105);
						local23 = true;
						local18 += local64 - 1;
						break;
					}
				}
			}
			if (!local23) {
				local11.append(local27);
			}
		}
		return local11.toString();
	}

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 73)
	public final String method27096(@OriginalArg(0) String arg0) {
		if (this.aLinkedList2.isEmpty()) {
			return arg0;
		}
		@Pc(11) StringBuilder local11 = new StringBuilder(arg0.length());
		@Pc(14) int local14 = arg0.length();
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(23) boolean local23 = false;
			@Pc(27) char local27 = arg0.charAt(local18);
			if (local16) {
				if (local27 == '>') {
					local16 = false;
				}
			} else if (local27 == '<') {
				local16 = true;
			} else if (this.aString187.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class293 local60 = (Class293) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString183.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString183)) {
						@Pc(105) String local105;
						if (local60.anInt4010 * 484620447 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4009 * 2010221443, local60.anInt4010 * 484620447);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4009 * 2010221443);
						}
						local11.append(local105);
						local23 = true;
						local18 += local64 - 1;
						break;
					}
				}
			}
			if (!local23) {
				local11.append(local27);
			}
		}
		return local11.toString();
	}

	@OriginalMember(owner = "client!hh", name = "ao", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 73)
	public final String method27097(@OriginalArg(0) String arg0) {
		if (this.aLinkedList2.isEmpty()) {
			return arg0;
		}
		@Pc(11) StringBuilder local11 = new StringBuilder(arg0.length());
		@Pc(14) int local14 = arg0.length();
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(23) boolean local23 = false;
			@Pc(27) char local27 = arg0.charAt(local18);
			if (local16) {
				if (local27 == '>') {
					local16 = false;
				}
			} else if (local27 == '<') {
				local16 = true;
			} else if (this.aString187.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class293 local60 = (Class293) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString183.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString183)) {
						@Pc(105) String local105;
						if (local60.anInt4010 * 484620447 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4009 * 2010221443, local60.anInt4010 * 484620447);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4009 * 2010221443);
						}
						local11.append(local105);
						local23 = true;
						local18 += local64 - 1;
						break;
					}
				}
			}
			if (!local23) {
				local11.append(local27);
			}
		}
		return local11.toString();
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 119)
	final void method27098() {
		this.aString187 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class293 local15 = (Class293) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString183.charAt(0);
			if (this.aString187.indexOf(local20) < 0) {
				this.aString187 = this.aString187 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "ak", descriptor = "()V", line = 119)
	final void method27099() {
		this.aString187 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class293 local15 = (Class293) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString183.charAt(0);
			if (this.aString187.indexOf(local20) < 0) {
				this.aString187 = this.aString187 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "au", descriptor = "()V", line = 119)
	final void method27100() {
		this.aString187 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class293 local15 = (Class293) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString183.charAt(0);
			if (this.aString187.indexOf(local20) < 0) {
				this.aString187 = this.aString187 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "aho", descriptor = "(Lclient!yf;B)V", line = 10671)
	static final void method27101(@OriginalArg(0) Class665 arg0) {
		@Pc(13) Class77_Sub1_Sub8 local13 = Class136.method13911(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		if (local13 == null || local13.aString104 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local13.aString104;
		}
	}
}
