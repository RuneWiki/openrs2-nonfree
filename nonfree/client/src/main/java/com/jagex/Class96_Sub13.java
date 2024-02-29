package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afp")
public class Class96_Sub13 extends Class96 {

	@OriginalMember(owner = "client!afp", name = "lf", descriptor = "I")
	public static int anInt883;

	@OriginalMember(owner = "client!afp", name = "c", descriptor = "J")
	final long aLong30;

	@OriginalMember(owner = "client!afp", name = "v", descriptor = "I")
	final int anInt882;

	@OriginalMember(owner = "client!afp", name = "<init>", descriptor = "(Lclient!akv;Z)V", line = 11)
	Class96_Sub13(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
		@Pc(6) int local6 = arg0.method22483();
		if (arg1) {
			this.aLong30 = ((long) local6 | 0x100000000L) * -3385536648515296051L;
		} else {
			this.aLong30 = (long) local6 * -3385536648515296051L;
		}
		this.anInt882 = arg0.method22500() * -862810263;
	}

	@OriginalMember(owner = "client!afp", name = "y", descriptor = "()V", line = 19)
	@Override
	public void method19912() {
		@Pc(7) Class77_Sub40 local7 = (Class77_Sub40) Class230.aClass12_24.method173(this.aLong30 * 2577283044914538501L);
		if (local7 == null) {
			Class230.aClass12_24.method184(new Class77_Sub40(this.anInt882 * -1367150375), this.aLong30 * 2577283044914538501L);
		} else {
			local7.anInt1786 = this.anInt882 * -1121957905;
		}
	}

	@OriginalMember(owner = "client!afp", name = "c", descriptor = "(I)V", line = 19)
	@Override
	public void method19911() {
		@Pc(7) Class77_Sub40 local7 = (Class77_Sub40) Class230.aClass12_24.method173(this.aLong30 * 2577283044914538501L);
		if (local7 == null) {
			Class230.aClass12_24.method184(new Class77_Sub40(this.anInt882 * -1367150375), this.aLong30 * 2577283044914538501L);
		} else {
			local7.anInt1786 = this.anInt882 * -1121957905;
		}
	}

	@OriginalMember(owner = "client!afp", name = "w", descriptor = "()V", line = 19)
	@Override
	public void method19913() {
		@Pc(7) Class77_Sub40 local7 = (Class77_Sub40) Class230.aClass12_24.method173(this.aLong30 * 2577283044914538501L);
		if (local7 == null) {
			Class230.aClass12_24.method184(new Class77_Sub40(this.anInt882 * -1367150375), this.aLong30 * 2577283044914538501L);
		} else {
			local7.anInt1786 = this.anInt882 * -1121957905;
		}
	}

	@OriginalMember(owner = "client!afp", name = "mg", descriptor = "(Ljava/lang/String;ZB)I", line = 12322)
	public static int method7481(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Class698.anIntArray543 = null;
		Class659.anInt5777 = 0;
		@Pc(10) LinkedList local10 = new LinkedList();
		@Pc(14) LinkedList local14 = new LinkedList();
		@Pc(20) int local20 = arg1 ? 32768 : 0;
		@Pc(34) int local34 = (arg1 ? RuntimeException_Sub4.aClass41_2.anInt160 * 64767945 : RuntimeException_Sub4.aClass41_2.anInt161 * -1840898795) + local20;
		@Pc(36) int local36;
		for (local36 = local20; local36 < local34; local36++) {
			@Pc(44) Class77_Sub1_Sub13 local44 = RuntimeException_Sub4.aClass41_2.method688(local36);
			if (local44.aBoolean498 && local44.method22311().toLowerCase().indexOf(local2) != -1) {
				if (local10.size() >= 50) {
					return -1;
				}
				local10.add(local36);
				local14.add(local44.method22311());
			}
		}
		Class698.anIntArray543 = new int[local10.size()];
		local36 = 0;
		@Pc(85) Iterator local85 = local10.iterator();
		while (local85.hasNext()) {
			@Pc(92) Integer local92 = (Integer) local85.next();
			Class698.anIntArray543[local36++] = local92;
		}
		@Pc(107) String[] local107 = (String[]) local14.toArray(new String[Class698.anIntArray543.length]);
		Class585.method31727(local107, Class698.anIntArray543);
		return local10.size();
	}
}
