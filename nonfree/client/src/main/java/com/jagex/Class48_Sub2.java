package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aew")
public class Class48_Sub2 extends Class48 {

	@OriginalMember(owner = "client!aew", name = "p", descriptor = "F")
	static final float aFloat140 = 2.0F;

	@OriginalMember(owner = "client!aew", name = "l", descriptor = "Z")
	volatile boolean aBoolean229 = false;

	@OriginalMember(owner = "client!aew", name = "s", descriptor = "Ljava/util/List;")
	List aList1 = new ArrayList();

	@OriginalMember(owner = "client!aew", name = "u", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable4 = new Class420(this);

	@OriginalMember(owner = "client!aew", name = "y", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable5 = new Class404(this);

	@OriginalMember(owner = "client!aew", name = "g", descriptor = "Lclient!js;")
	Class264 aClass264_2 = new Class264(this);

	@OriginalMember(owner = "client!aew", name = "a", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap2 = new HashMap();

	@OriginalMember(owner = "client!aew", name = "h", descriptor = "Ljava/lang/Thread;")
	Thread aThread3;

	@OriginalMember(owner = "client!aew", name = "x", descriptor = "Ljava/lang/Thread;")
	Thread aThread4;

	@OriginalMember(owner = "client!aew", name = "f", descriptor = "(B)Ljava/util/HashMap;", line = 99)
	HashMap method9537() {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!aew", name = "<init>", descriptor = "(Lclient!ur;)V", line = 102)
	public Class48_Sub2(@OriginalArg(0) Class511 arg0) {
		@Pc(37) Iterator local37 = arg0.aHashMap9.keySet().iterator();
		@Pc(44) Class357 local44;
		while (local37.hasNext()) {
			local44 = (Class357) local37.next();
			this.aHashMap2.put(local44, new Class371[(Integer) arg0.aHashMap9.get(local44)]);
		}
		local37 = this.aHashMap2.keySet().iterator();
		while (local37.hasNext()) {
			local44 = (Class357) local37.next();
			@Pc(76) Class371[] local76 = (Class371[]) this.aHashMap2.get(local44);
			for (@Pc(78) int local78 = 0; local78 < local76.length; local78++) {
				@Pc(87) Class184 local87 = new Class184(2.0F);
				local87.method23787(0, Class280.aClass280_5, Class289.aClass289_2, 2);
				local76[local78] = new Class371(local44, 8192, 3, local87, this);
			}
		}
		@Pc(114) Class422 local114 = new Class422(this, 44100.0F, 32768);
		@Pc(121) Class422 local121 = new Class422(this, 22050.0F, 16384);
		this.aList1.add(local114);
		this.aList1.add(local121);
		this.aThread3 = new Thread(this.aRunnable5);
		this.aThread4 = new Thread(this.aRunnable4);
		this.aThread3.setPriority(10);
		this.aThread4.setPriority(10);
		this.aThread3.start();
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!aew", name = "p", descriptor = "(B)V", line = 138)
	@Override
	public void method9511() {
		if (this.aClass264_2 != null) {
			this.aClass264_2.method25230();
		}
		@Pc(11) Iterator local11 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(25) Class371[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class357 local18 = (Class357) local11.next();
				local25 = (Class371[]) this.aHashMap2.get(local18);
				if (!local18.aBoolean722) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method27131();
						local30 |= local25[local32].method27167();
					}
					if (local30) {
						Arrays.sort(local25, new Class405(this));
					}
				}
				local61 = 6;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method27158();
					@Pc(83) Class375 local83 = local25[local68].method27136();
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (Class375.aClass375_6 == local83 || local83 == Class375.aClass375_4 || Class375.aClass375_5 == local83) {
						local25[local68].method27094();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class375 local128 = local25[local68].method27136();
				if (Class375.aClass375_6 == local128) {
					local25[local68].method27094();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aew", name = "c", descriptor = "()V", line = 138)
	@Override
	public void method9521() {
		if (this.aClass264_2 != null) {
			this.aClass264_2.method25230();
		}
		@Pc(11) Iterator local11 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(25) Class371[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class357 local18 = (Class357) local11.next();
				local25 = (Class371[]) this.aHashMap2.get(local18);
				if (!local18.aBoolean722) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method27131();
						local30 |= local25[local32].method27167();
					}
					if (local30) {
						Arrays.sort(local25, new Class405(this));
					}
				}
				local61 = 6;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method27158();
					@Pc(83) Class375 local83 = local25[local68].method27136();
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (Class375.aClass375_6 == local83 || local83 == Class375.aClass375_4 || Class375.aClass375_5 == local83) {
						local25[local68].method27094();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class375 local128 = local25[local68].method27136();
				if (Class375.aClass375_6 == local128) {
					local25[local68].method27094();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aew", name = "z", descriptor = "()V", line = 138)
	@Override
	public void method9522() {
		if (this.aClass264_2 != null) {
			this.aClass264_2.method25230();
		}
		@Pc(11) Iterator local11 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(25) Class371[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class357 local18 = (Class357) local11.next();
				local25 = (Class371[]) this.aHashMap2.get(local18);
				if (!local18.aBoolean722) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method27131();
						local30 |= local25[local32].method27167();
					}
					if (local30) {
						Arrays.sort(local25, new Class405(this));
					}
				}
				local61 = 6;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method27158();
					@Pc(83) Class375 local83 = local25[local68].method27136();
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (Class375.aClass375_6 == local83 || local83 == Class375.aClass375_4 || Class375.aClass375_5 == local83) {
						local25[local68].method27094();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class375 local128 = local25[local68].method27136();
				if (Class375.aClass375_6 == local128) {
					local25[local68].method27094();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aew", name = "b", descriptor = "()V", line = 138)
	@Override
	public void method9528() {
		if (this.aClass264_2 != null) {
			this.aClass264_2.method25230();
		}
		@Pc(11) Iterator local11 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(25) Class371[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class357 local18 = (Class357) local11.next();
				local25 = (Class371[]) this.aHashMap2.get(local18);
				if (!local18.aBoolean722) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method27131();
						local30 |= local25[local32].method27167();
					}
					if (local30) {
						Arrays.sort(local25, new Class405(this));
					}
				}
				local61 = 6;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method27158();
					@Pc(83) Class375 local83 = local25[local68].method27136();
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (Class375.aClass375_6 == local83 || local83 == Class375.aClass375_4 || Class375.aClass375_5 == local83) {
						local25[local68].method27094();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class375 local128 = local25[local68].method27136();
				if (Class375.aClass375_6 == local128) {
					local25[local68].method27094();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aew", name = "j", descriptor = "(Ljava/lang/Object;)I", line = 198)
	@Override
	public int method9517(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class419)) {
			return 0;
		}
		@Pc(8) Class419 local8 = (Class419) arg0;
		@Pc(12) Class422 local12 = local8.aClass422_1;
		synchronized (local8.aClass422_1) {
			return local8.method27835();
		}
	}

	@OriginalMember(owner = "client!aew", name = "h", descriptor = "(Ljava/lang/Object;I)I", line = 198)
	@Override
	public int method9515(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class419)) {
			return 0;
		}
		@Pc(8) Class419 local8 = (Class419) arg0;
		@Pc(12) Class422 local12 = local8.aClass422_1;
		synchronized (local8.aClass422_1) {
			return local8.method27835();
		}
	}

	@OriginalMember(owner = "client!aew", name = "at", descriptor = "(F)Lclient!qz;", line = 208)
	Class422 method9538(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class422 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class422 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class422) local9.next();
				local19 = local16.aFloat301;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}

	@OriginalMember(owner = "client!aew", name = "k", descriptor = "(FI)Lclient!qz;", line = 208)
	Class422 method9539(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class422 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class422 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class422) local9.next();
				local19 = local16.aFloat301;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}

	@OriginalMember(owner = "client!aew", name = "af", descriptor = "(F)Lclient!qz;", line = 208)
	Class422 method9540(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class422 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class422 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class422) local9.next();
				local19 = local16.aFloat301;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}

	@OriginalMember(owner = "client!aew", name = "a", descriptor = "(IILclient!kl;Lclient!kx;IFB)Ljava/lang/Object;", line = 227)
	@Override
	public Object method9512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) Class289 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class422 local7 = this.method9539((float) arg1 * arg5);
		@Pc(43) Class419 local43 = new Class419(this, local7, arg4, arg5 * (float) arg1, arg2.anInt4334 * -2085764227, arg0 < 2 ? 2 : arg0, arg2 == Class280.aClass280_5 || Class280.aClass280_2 == arg2, Class289.aClass289_3 == arg3);
		@Pc(47) Class422 local47 = local43.aClass422_1;
		synchronized (local43.aClass422_1) {
			local43.aClass422_1.method27857(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aew", name = "n", descriptor = "(IILclient!kl;Lclient!kx;IF)Ljava/lang/Object;", line = 227)
	@Override
	public Object method9524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) Class289 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class422 local7 = this.method9539((float) arg1 * arg5);
		@Pc(43) Class419 local43 = new Class419(this, local7, arg4, arg5 * (float) arg1, arg2.anInt4334 * -2085764227, arg0 < 2 ? 2 : arg0, arg2 == Class280.aClass280_5 || Class280.aClass280_2 == arg2, Class289.aClass289_3 == arg3);
		@Pc(47) Class422 local47 = local43.aClass422_1;
		synchronized (local43.aClass422_1) {
			local43.aClass422_1.method27857(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aew", name = "g", descriptor = "(Ljava/lang/Object;S)V", line = 236)
	@Override
	public void method9516(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class419)) {
			return;
		}
		@Pc(7) Class419 local7 = (Class419) arg0;
		@Pc(11) Class422 local11 = local7.aClass422_1;
		synchronized (local7.aClass422_1) {
			local7.aClass422_1.method27868(local7);
		}
	}

	@OriginalMember(owner = "client!aew", name = "e", descriptor = "(Ljava/lang/Object;)V", line = 236)
	@Override
	public void method9525(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class419)) {
			return;
		}
		@Pc(7) Class419 local7 = (Class419) arg0;
		@Pc(11) Class422 local11 = local7.aClass422_1;
		synchronized (local7.aClass422_1) {
			local7.aClass422_1.method27868(local7);
		}
	}

	@OriginalMember(owner = "client!aew", name = "r", descriptor = "(Ljava/lang/Object;)V", line = 236)
	@Override
	public void method9513(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class419)) {
			return;
		}
		@Pc(7) Class419 local7 = (Class419) arg0;
		@Pc(11) Class422 local11 = local7.aClass422_1;
		synchronized (local7.aClass422_1) {
			local7.aClass422_1.method27868(local7);
		}
	}

	@OriginalMember(owner = "client!aew", name = "l", descriptor = "(Ljava/lang/Object;[BIIB)V", line = 245)
	@Override
	public void method9526(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class419)) {
			return;
		}
		@Pc(7) Class419 local7 = (Class419) arg0;
		@Pc(11) Class422 local11 = local7.aClass422_1;
		synchronized (local7.aClass422_1) {
			local7.method27834(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aew", name = "d", descriptor = "(Ljava/lang/Object;[BII)V", line = 245)
	@Override
	public void method9527(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class419)) {
			return;
		}
		@Pc(7) Class419 local7 = (Class419) arg0;
		@Pc(11) Class422 local11 = local7.aClass422_1;
		synchronized (local7.aClass422_1) {
			local7.method27834(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aew", name = "x", descriptor = "(Lclient!nu;B)Lclient!on;", line = 254)
	@Override
	public Class371 method9510(@OriginalArg(0) Class357 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class371[] local11 = (Class371[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class371 local27 = local11[local19];
				@Pc(31) Class375 local31 = local27.method27136();
				if (local31 == Class375.aClass375_2) {
					local27.method27151();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aew", name = "v", descriptor = "(Lclient!nu;)Lclient!on;", line = 254)
	@Override
	public Class371 method9530(@OriginalArg(0) Class357 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class371[] local11 = (Class371[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class371 local27 = local11[local19];
				@Pc(31) Class375 local31 = local27.method27136();
				if (local31 == Class375.aClass375_2) {
					local27.method27151();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aew", name = "q", descriptor = "(Lclient!nu;)Lclient!on;", line = 254)
	@Override
	public Class371 method9514(@OriginalArg(0) Class357 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class371[] local11 = (Class371[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class371 local27 = local11[local19];
				@Pc(31) Class375 local31 = local27.method27136();
				if (local31 == Class375.aClass375_2) {
					local27.method27151();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aew", name = "m", descriptor = "(Lclient!nu;)Lclient!on;", line = 254)
	@Override
	public Class371 method9529(@OriginalArg(0) Class357 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class371[] local11 = (Class371[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class371 local27 = local11[local19];
				@Pc(31) Class375 local31 = local27.method27136();
				if (local31 == Class375.aClass375_2) {
					local27.method27151();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aew", name = "s", descriptor = "(Lclient!kf;I)Ljava/lang/Object;", line = 270)
	@Override
	Object method9523(@OriginalArg(0) Class275 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aew", name = "i", descriptor = "(Lclient!kf;)Ljava/lang/Object;", line = 270)
	@Override
	Object method9533(@OriginalArg(0) Class275 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aew", name = "u", descriptor = "(I)Lclient!js;", line = 274)
	@Override
	public Class264 method9518() {
		return this.aClass264_2;
	}

	@OriginalMember(owner = "client!aew", name = "t", descriptor = "()Lclient!js;", line = 274)
	@Override
	public Class264 method9531() {
		return this.aClass264_2;
	}

	@OriginalMember(owner = "client!aew", name = "w", descriptor = "()Lclient!js;", line = 274)
	@Override
	public Class264 method9532() {
		return this.aClass264_2;
	}

	@OriginalMember(owner = "client!aew", name = "y", descriptor = "(I)V", line = 278)
	@Override
	public void method9519() {
		@Pc(3) HashMap local3 = this.method9537();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class357 local18 = (Class357) local11.next();
				@Pc(24) Class371[] local24 = (Class371[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method27136() != Class375.aClass375_2) {
						local24[local26].method27094();
						local24[local26].method27089();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class357 local79 = (Class357) local72.next();
					@Pc(85) Class371[] local85 = (Class371[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method27136() != Class375.aClass375_2) {
							local85[local87].method27131();
							local60 = false;
						}
					}
				}
			}
			Class60_Sub11.method13407(10L);
		}
		this.aBoolean229 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aew", name = "o", descriptor = "()V", line = 278)
	@Override
	public void method9520() {
		@Pc(3) HashMap local3 = this.method9537();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class357 local18 = (Class357) local11.next();
				@Pc(24) Class371[] local24 = (Class371[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method27136() != Class375.aClass375_2) {
						local24[local26].method27094();
						local24[local26].method27089();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class357 local79 = (Class357) local72.next();
					@Pc(85) Class371[] local85 = (Class371[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method27136() != Class375.aClass375_2) {
							local85[local87].method27131();
							local60 = false;
						}
					}
				}
			}
			Class60_Sub11.method13407(10L);
		}
		this.aBoolean229 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aew", name = "ja", descriptor = "(ZI)V", line = 8887)
	static final void method9541(@OriginalArg(0) boolean arg0) {
		client.anInt3173 = 0;
		client.anInt3057 = 0;
		client.anInt3058 += 2068020385;
		Class410.method27675();
		Class412.method27704(arg0);
		Class306.method25730();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		@Pc(27) int local27;
		for (local18 = 0; local18 < client.anInt3173 * -2017576269; local18++) {
			local27 = client.anIntArray294[local18];
			@Pc(33) Class3_Sub29 local33 = (Class3_Sub29) client.aClass581_21.method33217((long) local27);
			@Pc(37) Class26_Sub1_Sub1_Sub1_Sub1 local37 = (Class26_Sub1_Sub1_Sub1_Sub1) local33.anObject2;
			if (local37.anInt2378 * 1557365115 != client.anInt3058 * 514418529) {
				if (Class250.aBoolean688 && Class359.method26756(local27)) {
					Class604.method33533();
				}
				if (local37.aClass571_1.method33057()) {
					Class316.method25840(local37);
				}
				local37.method15495(null);
				local33.method33656();
				local16 = true;
			}
		}
		if (local16) {
			local18 = client.anInt3054 * -453205259;
			client.anInt3054 = client.aClass581_21.method33220() * -1735952035;
			local27 = 0;
			@Pc(89) Iterator local89 = client.aClass581_21.iterator();
			while (local89.hasNext()) {
				@Pc(96) Class3_Sub29 local96 = (Class3_Sub29) local89.next();
				client.aClass3_Sub29Array1[local27++] = local96;
			}
			for (@Pc(106) int local106 = client.anInt3054 * -453205259; local106 < local18; local106++) {
				client.aClass3_Sub29Array1[local106] = null;
			}
			@Pc(119) Class204 local119 = Class80.aClass23_Sub1_1.method5887();
			if (Class204.aClass204_3 == local119) {
				@Pc(127) Class30_Sub3 local127 = (Class30_Sub3) Class80.aClass23_Sub1_1.method5827();
				local127.method7844();
			}
			@Pc(134) Class208 local134 = Class80.aClass23_Sub1_1.method5830();
			if (Class208.aClass208_3 == local134) {
				@Pc(142) Class69_Sub5 local142 = (Class69_Sub5) Class80.aClass23_Sub1_1.method5799();
				local142.method14689();
			}
		}
		if (client.aClass82_2.aClass3_Sub41_Sub1_2.anInt2803 * 62066237 != client.aClass82_2.anInt2915 * -64841839) {
			throw new RuntimeException(client.aClass82_2.aClass3_Sub41_Sub1_2.anInt2803 * 62066237 + " " + client.aClass82_2.anInt2915 * -64841839);
		}
		for (local18 = 0; local18 < client.anInt3163 * 1758488217; local18++) {
			if (client.aClass581_21.method33217((long) client.anIntArray303[local18]) == null) {
				throw new RuntimeException(local18 + " " + client.anInt3163 * 1758488217);
			}
		}
		if (client.anInt3054 * -453205259 - client.anInt3163 * 1758488217 != 0) {
			throw new RuntimeException("" + (client.anInt3054 * -453205259 - client.anInt3163 * 1758488217));
		}
		for (local18 = 0; local18 < client.anInt3054 * -453205259; local18++) {
			if (((Class26_Sub1_Sub1_Sub1) client.aClass3_Sub29Array1[local18].anObject2).anInt2378 * 1557365115 != client.anInt3058 * 514418529) {
				throw new RuntimeException("" + ((Class26_Sub1_Sub1_Sub1) client.aClass3_Sub29Array1[local18].anObject2).anInt2355 * 144783765);
			}
		}
	}
}
