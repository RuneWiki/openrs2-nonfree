package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fz")
public class Class264 {

	@OriginalMember(owner = "client!fz", name = "c", descriptor = "I")
	static final int anInt3824 = 8;

	@OriginalMember(owner = "client!fz", name = "p", descriptor = "I")
	static final int anInt3826 = 40;

	@OriginalMember(owner = "client!fz", name = "ed", descriptor = "Z")
	static boolean aBoolean660;

	@OriginalMember(owner = "client!fz", name = "v", descriptor = "Ljava/lang/Integer;")
	static final Integer anInteger1 = -1;

	@OriginalMember(owner = "client!fz", name = "l", descriptor = "I")
	public final int anInt3825;

	@OriginalMember(owner = "client!fz", name = "y", descriptor = "Ljava/util/List;")
	final List aList10;

	@OriginalMember(owner = "client!fz", name = "w", descriptor = "Ljava/util/List;")
	final List aList11;

	@OriginalMember(owner = "client!fz", name = "t", descriptor = "Ljava/util/List;")
	final List aList12;

	@OriginalMember(owner = "client!fz", name = "q", descriptor = "Ljava/util/List;")
	final List aList9;

	@OriginalMember(owner = "client!fz", name = "<init>", descriptor = "(I)V", line = 16)
	public Class264(@OriginalArg(0) int arg0) {
		this.anInt3825 = arg0 * 683959903;
		this.aList10 = new ArrayList();
		this.aList11 = new ArrayList();
		this.aList12 = new ArrayList();
		this.aList9 = new ArrayList();
	}

	@OriginalMember(owner = "client!fz", name = "p", descriptor = "(I)I", line = 25)
	public int method26392() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fz", name = "n", descriptor = "()I", line = 25)
	public int method26393() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fz", name = "c", descriptor = "(I)I", line = 29)
	public int method26394() {
		return this.aList11.size();
	}

	@OriginalMember(owner = "client!fz", name = "a", descriptor = "()I", line = 29)
	public int method26395() {
		return this.aList11.size();
	}

	@OriginalMember(owner = "client!fz", name = "m", descriptor = "()I", line = 29)
	public int method26396() {
		return this.aList11.size();
	}

	@OriginalMember(owner = "client!fz", name = "v", descriptor = "(II)I", line = 33)
	public int method26397(@OriginalArg(0) int arg0) {
		return this.aList11.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "l", descriptor = "(IB)I", line = 37)
	public int method26398(@OriginalArg(0) int arg0) {
		return (Integer) this.aList11.get(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "h", descriptor = "(I)I", line = 37)
	public int method26399(@OriginalArg(0) int arg0) {
		return (Integer) this.aList11.get(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "aj", descriptor = "(I)I", line = 37)
	public int method26400(@OriginalArg(0) int arg0) {
		return (Integer) this.aList11.get(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "ai", descriptor = "(I)I", line = 37)
	public int method26401(@OriginalArg(0) int arg0) {
		return (Integer) this.aList11.get(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "y", descriptor = "(IB)I", line = 41)
	public int method26402(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "ag", descriptor = "(I)I", line = 41)
	public int method26403(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "al", descriptor = "(I)I", line = 41)
	public int method26404(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "w", descriptor = "(II)I", line = 45)
	public int method26405(@OriginalArg(0) int arg0) {
		return (Integer) this.aList10.get(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "ao", descriptor = "(I)I", line = 45)
	public int method26406(@OriginalArg(0) int arg0) {
		return (Integer) this.aList10.get(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "ak", descriptor = "(I)I", line = 45)
	public int method26407(@OriginalArg(0) int arg0) {
		return (Integer) this.aList10.get(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "t", descriptor = "(IB)I", line = 49)
	public int method26408(@OriginalArg(0) int arg0) {
		return this.method26420(arg0, -1);
	}

	@OriginalMember(owner = "client!fz", name = "au", descriptor = "(I)I", line = 49)
	public int method26409(@OriginalArg(0) int arg0) {
		return this.method26420(arg0, -1);
	}

	@OriginalMember(owner = "client!fz", name = "ax", descriptor = "(I)I", line = 49)
	public int method26410(@OriginalArg(0) int arg0) {
		return this.method26420(arg0, -1);
	}

	@OriginalMember(owner = "client!fz", name = "ar", descriptor = "(I)I", line = 49)
	public int method26411(@OriginalArg(0) int arg0) {
		return this.method26420(arg0, -1);
	}

	@OriginalMember(owner = "client!fz", name = "q", descriptor = "(IZI)V", line = 53)
	public void method26412(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList12.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fz", name = "ad", descriptor = "(IZ)V", line = 53)
	public void method26413(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList12.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fz", name = "av", descriptor = "(II)V", line = 57)
	public void method26414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList12.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fz", name = "ac", descriptor = "(II)V", line = 57)
	public void method26415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList12.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fz", name = "x", descriptor = "(III)V", line = 57)
	public void method26416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList12.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fz", name = "d", descriptor = "(II)Z", line = 61)
	public boolean method26417(@OriginalArg(0) int arg0) {
		return !((Integer) this.aList12.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fz", name = "at", descriptor = "(I)Z", line = 61)
	public boolean method26418(@OriginalArg(0) int arg0) {
		return !((Integer) this.aList12.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fz", name = "ae", descriptor = "(I)Z", line = 61)
	public boolean method26419(@OriginalArg(0) int arg0) {
		return !((Integer) this.aList12.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fz", name = "s", descriptor = "(III)I", line = 65)
	public int method26420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26402(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.aList10.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList9.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fz", name = "ah", descriptor = "(II)I", line = 65)
	public int method26421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26402(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.aList10.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList9.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fz", name = "as", descriptor = "(II)I", line = 65)
	public int method26422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26402(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.aList10.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList9.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fz", name = "aq", descriptor = "(II)I", line = 65)
	public int method26423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26402(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.aList10.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList9.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fz", name = "r", descriptor = "(IB)V", line = 79)
	public void method26424(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		@Pc(8) Iterator local8 = this.aList9.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fz", name = "g", descriptor = "(IB)I", line = 89)
	public int method26425(@OriginalArg(0) int arg0) {
		return this.method26432(arg0, -1);
	}

	@OriginalMember(owner = "client!fz", name = "am", descriptor = "(I)I", line = 89)
	public int method26426(@OriginalArg(0) int arg0) {
		return this.method26432(arg0, -1);
	}

	@OriginalMember(owner = "client!fz", name = "z", descriptor = "(IIB)V", line = 93)
	public void method26427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26430(arg0, arg1);
		for (@Pc(6) int local6 = 0; local6 < this.aList12.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList12.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList12.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "ay", descriptor = "(II)V", line = 93)
	public void method26428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26430(arg0, arg1);
		for (@Pc(6) int local6 = 0; local6 < this.aList12.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList12.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList12.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "af", descriptor = "(II)V", line = 93)
	public void method26429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26430(arg0, arg1);
		for (@Pc(6) int local6 = 0; local6 < this.aList12.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList12.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList12.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "j", descriptor = "(IIB)V", line = 103)
	void method26430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.add(arg1, this.aList11.remove(arg0));
		this.aList12.add(arg1, this.aList12.remove(arg0));
		this.aList9.add(arg1, this.aList9.remove(arg0));
	}

	@OriginalMember(owner = "client!fz", name = "an", descriptor = "(II)V", line = 103)
	void method26431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.add(arg1, this.aList11.remove(arg0));
		this.aList12.add(arg1, this.aList12.remove(arg0));
		this.aList9.add(arg1, this.aList9.remove(arg0));
	}

	@OriginalMember(owner = "client!fz", name = "i", descriptor = "(III)I", line = 109)
	public int method26432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList11.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26397(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList11.size();
			}
			this.method26436(arg0, arg1);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList11.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList12.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26430(local36, local36 - 1);
				}
			}
			return this.method26397(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fz", name = "ab", descriptor = "(II)I", line = 109)
	public int method26433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList11.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26397(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList11.size();
			}
			this.method26436(arg0, arg1);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList11.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList12.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26430(local36, local36 - 1);
				}
			}
			return this.method26397(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fz", name = "aa", descriptor = "(II)I", line = 109)
	public int method26434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList11.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26397(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList11.size();
			}
			this.method26436(arg0, arg1);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList11.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList12.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26430(local36, local36 - 1);
				}
			}
			return this.method26397(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fz", name = "ap", descriptor = "(II)I", line = 109)
	public int method26435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList11.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26397(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList11.size();
			}
			this.method26436(arg0, arg1);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList11.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList12.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26430(local36, local36 - 1);
				}
			}
			return this.method26397(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fz", name = "k", descriptor = "(III)V", line = 123)
	void method26436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.add(arg1, arg0);
		this.aList12.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList10.size(); local16++) {
			local14.add(null);
		}
		this.aList9.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fz", name = "aw", descriptor = "(II)V", line = 123)
	void method26437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.add(arg1, arg0);
		this.aList12.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList10.size(); local16++) {
			local14.add(null);
		}
		this.aList9.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fz", name = "u", descriptor = "(II)V", line = 131)
	public void method26438(@OriginalArg(0) int arg0) {
		this.method26442(arg0);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList11.size(); local7++) {
			if (!this.method26417(local7)) {
				if (local5 != local7) {
					this.method26430(local7, local5);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "az", descriptor = "(I)V", line = 131)
	public void method26439(@OriginalArg(0) int arg0) {
		this.method26442(arg0);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList11.size(); local7++) {
			if (!this.method26417(local7)) {
				if (local5 != local7) {
					this.method26430(local7, local5);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "bc", descriptor = "(I)V", line = 131)
	public void method26440(@OriginalArg(0) int arg0) {
		this.method26442(arg0);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList11.size(); local7++) {
			if (!this.method26417(local7)) {
				if (local5 != local7) {
					this.method26430(local7, local5);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "bj", descriptor = "(I)V", line = 131)
	public void method26441(@OriginalArg(0) int arg0) {
		this.method26442(arg0);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList11.size(); local7++) {
			if (!this.method26417(local7)) {
				if (local5 != local7) {
					this.method26430(local7, local5);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "e", descriptor = "(II)V", line = 142)
	void method26442(@OriginalArg(0) int arg0) {
		this.aList11.remove(arg0);
		this.aList12.remove(arg0);
		this.aList9.remove(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "bv", descriptor = "(I)V", line = 142)
	void method26443(@OriginalArg(0) int arg0) {
		this.aList11.remove(arg0);
		this.aList12.remove(arg0);
		this.aList9.remove(arg0);
	}

	@OriginalMember(owner = "client!fz", name = "ba", descriptor = "(II)V", line = 148)
	public void method26444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		@Pc(11) Iterator local11 = this.aList9.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fz", name = "bl", descriptor = "(II)V", line = 148)
	public void method26445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		@Pc(11) Iterator local11 = this.aList9.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fz", name = "f", descriptor = "(III)V", line = 148)
	public void method26446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		@Pc(11) Iterator local11 = this.aList9.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fz", name = "bb", descriptor = "(II)V", line = 148)
	public void method26447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		@Pc(11) Iterator local11 = this.aList9.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fz", name = "o", descriptor = "(IIS)Ljava/lang/Object;", line = 158)
	public Object method26448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList9.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fz", name = "b", descriptor = "(IILjava/lang/Object;I)V", line = 162)
	public void method26449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		((List) this.aList9.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fz", name = "c", descriptor = "(I)V", line = 165)
	public static void method26450() {
		Class458.anInt4960 = 0;
		Class458.anInt4961 = 0;
	}

	@OriginalMember(owner = "client!fz", name = "ht", descriptor = "(IB)V", line = 3742)
	public static final void method26451(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			client.aBooleanArray16[local1] = false;
		}
		client.anInt3441 = 1871523627;
		client.anInt3442 = -378787251;
		Class56.anInt190 = 0;
		Class250.anInt3805 = 0;
		Class142.anInt2017 = 309821991;
		Class70.anInt203 = 1899572639;
		Class11.anInt36 = arg0 * -1822037319;
		if (Class11.anInt36 * -891094135 != 3) {
			Class3.aLong1 = 0L;
		}
	}

	@OriginalMember(owner = "client!fz", name = "ok", descriptor = "(Lclient!yf;B)V", line = 7114)
	static final void method26452(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class110_Sub1.method9165(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fz", name = "ob", descriptor = "(Lclient!yf;B)V", line = 7128)
	static final void method26453(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class494.method30056(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!fz", name = "pt", descriptor = "(Lclient!yf;I)V", line = 7428)
	static final void method26454(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3876 * -742015869;
	}

	@OriginalMember(owner = "client!fz", name = "rx", descriptor = "(Lclient!yf;I)V", line = 7753)
	static final void method26455(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class509.method30284(local16, arg0);
	}
}
