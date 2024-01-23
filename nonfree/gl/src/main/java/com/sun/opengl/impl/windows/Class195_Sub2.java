package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.Class195;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/windows/WindowsGLDrawable")
public abstract class Class195_Sub2 extends Class195 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "hdc", descriptor = "J")
	protected long aLong1324;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "pixelFormatChosen", descriptor = "Z")
	protected boolean aBoolean473;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "capabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	private GLCapabilities aGLCapabilities5;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "chooser", descriptor = "Lgl!javax/media/opengl/GLCapabilitiesChooser;")
	private GLCapabilitiesChooser aGLCapabilitiesChooser5;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "glCapabilities2PFD", descriptor = "(Lgl!javax/media/opengl/GLCapabilities;Z)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	protected static Class202 method4765(@OriginalArg(0) GLCapabilities arg0) {
		@Pc(8) int local8 = arg0.getRedBits() + arg0.getGreenBits() + arg0.getBlueBits();
		if (local8 < 15) {
			throw new GLException("Bit depths < 15 (i.e., non-true-color) not supported");
		}
		@Pc(18) Class202 local18 = method4766();
		@Pc(20) short local20 = 4128;
		if (arg0.getDoubleBuffered()) {
			local20 = 4129;
		}
		@Pc(33) int local33 = local20 | 0x4;
		if (arg0.getStereo()) {
			local33 |= 0x2;
		}
		local18.method4700(local33);
		local18.method4702();
		local18.method4703((byte) local8);
		local18.method4704((byte) arg0.getRedBits());
		local18.method4706((byte) arg0.getGreenBits());
		local18.method4708((byte) arg0.getBlueBits());
		local18.method4710((byte) arg0.getAlphaBits());
		@Pc(91) int local91 = arg0.getAccumRedBits() + arg0.getAccumGreenBits() + arg0.getAccumBlueBits();
		local18.method4712((byte) local91);
		local18.method4713((byte) arg0.getAccumRedBits());
		local18.method4715((byte) arg0.getAccumGreenBits());
		local18.method4717((byte) arg0.getAccumBlueBits());
		local18.method4719((byte) arg0.getAccumAlphaBits());
		local18.method4721((byte) arg0.getDepthBits());
		local18.method4723((byte) arg0.getStencilBits());
		local18.method4725();
		return local18;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "newPixelFormatDescriptor", descriptor = "()Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	private static Class202 method4766() {
		@Pc(1) Class202 local1 = Class202.method4695();
		local1.method4698((short) Class202.method4631());
		local1.method4699();
		return local1;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "pfd2GLCapabilities", descriptor = "(Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;)Lgl!javax/media/opengl/GLCapabilities;")
	private static GLCapabilities method4767(@OriginalArg(0) Class202 arg0) {
		if ((arg0.method4701() & 0x20) == 0) {
			return null;
		}
		@Pc(10) GLCapabilities local10 = new GLCapabilities();
		local10.setRedBits(arg0.method4705());
		local10.setGreenBits(arg0.method4707());
		local10.setBlueBits(arg0.method4709());
		local10.setAlphaBits(arg0.method4711());
		local10.setAccumRedBits(arg0.method4714());
		local10.setAccumGreenBits(arg0.method4716());
		local10.setAccumBlueBits(arg0.method4718());
		local10.setAccumAlphaBits(arg0.method4720());
		local10.setDepthBits(arg0.method4722());
		local10.setStencilBits(arg0.method4724());
		local10.setDoubleBuffered((arg0.method4701() & 0x1) != 0);
		local10.setStereo((arg0.method4701() & 0x2) != 0);
		local10.setHardwareAccelerated((arg0.method4701() & 0x40) == 0 || (arg0.method4701() & 0x1000) != 0);
		return local10;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "glCapabilities2iattributes", descriptor = "(Lgl!javax/media/opengl/GLCapabilities;[ILgl!com/sun/opengl/impl/windows/WGLExt;[I)Z")
	private static boolean method4768(@OriginalArg(0) GLCapabilities arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Interface9 arg2, @OriginalArg(3) int[] arg3) throws GLException {
		if (!arg2.method4739("WGL_ARB_pixel_format")) {
			return false;
		}
		@Pc(7) byte local7 = 0;
		@Pc(10) int local10 = local7 + 1;
		arg1[0] = 8208;
		@Pc(15) int local15 = local10 + 1;
		arg1[1] = 1;
		@Pc(20) int local20 = local15 + 1;
		arg1[2] = 8193;
		@Pc(25) int local25 = local20 + 1;
		arg1[3] = 1;
		@Pc(30) int local30 = local25 + 1;
		arg1[4] = 8209;
		if (arg0.getDoubleBuffered()) {
			local10 = local30 + 1;
			arg1[5] = 1;
		} else {
			local10 = local30 + 1;
			arg1[5] = 0;
		}
		local10++;
		arg1[6] = 8210;
		if (arg0.getStereo()) {
			local10++;
			arg1[7] = 1;
		} else {
			local10++;
			arg1[7] = 0;
		}
		local10++;
		arg1[8] = 8226;
		local10++;
		arg1[9] = arg0.getDepthBits();
		local10++;
		arg1[10] = 8213;
		local10++;
		arg1[11] = arg0.getRedBits();
		local10++;
		arg1[12] = 8215;
		local10++;
		arg1[13] = arg0.getGreenBits();
		local10++;
		arg1[14] = 8217;
		local10++;
		arg1[15] = arg0.getBlueBits();
		local10++;
		arg1[16] = 8219;
		local10++;
		arg1[17] = arg0.getAlphaBits();
		local10++;
		arg1[18] = 8227;
		local10++;
		arg1[19] = arg0.getStencilBits();
		if (arg0.getAccumRedBits() > 0 || arg0.getAccumGreenBits() > 0 || arg0.getAccumBlueBits() > 0 || arg0.getAccumAlphaBits() > 0) {
			local10++;
			arg1[20] = 8221;
			local10++;
			arg1[21] = arg0.getAccumRedBits() + arg0.getAccumGreenBits() + arg0.getAccumBlueBits() + arg0.getAccumAlphaBits();
			local10++;
			arg1[22] = 8222;
			local10++;
			arg1[23] = arg0.getAccumRedBits();
			local10++;
			arg1[24] = 8223;
			local10++;
			arg1[25] = arg0.getAccumGreenBits();
			local10++;
			arg1[26] = 8224;
			local10++;
			arg1[27] = arg0.getAccumBlueBits();
			local10++;
			arg1[28] = 8225;
			local10++;
			arg1[29] = arg0.getAccumAlphaBits();
		}
		if (arg2.method4739("WGL_ARB_multisample") && arg0.getSampleBuffers()) {
			arg1[local10++] = 8257;
			arg1[local10++] = 1;
			arg1[local10++] = 8258;
			arg1[local10++] = arg0.getNumSamples();
		}
		arg1[local10++] = 8211;
		arg1[local10++] = 8235;
		return true;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "iattributes2GLCapabilities", descriptor = "([II[IZ)Lgl!javax/media/opengl/GLCapabilities;")
	private static GLCapabilities method4769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(3) GLCapabilities local3 = new GLCapabilities();
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			@Pc(12) int local12 = arg0[local5];
			switch(local12) {
				case 8193:
					if (arg2[local5] != 1) {
						return null;
					}
					break;
				case 8195:
					local3.setHardwareAccelerated(arg2[local5] == 8231);
					break;
				case 8208:
					if (arg2[local5] != 1) {
						return null;
					}
					break;
				case 8209:
					local3.setDoubleBuffered(arg2[local5] == 1);
					break;
				case 8210:
					local3.setStereo(arg2[local5] == 1);
					break;
				case 8211:
					if (arg2[local5] == 8235 || arg2[local5] == 8608) {
						local3.setPbufferFloatingPointBuffers(true);
					}
					break;
				case 8213:
					local3.setRedBits(arg2[local5]);
					break;
				case 8215:
					local3.setGreenBits(arg2[local5]);
					break;
				case 8217:
					local3.setBlueBits(arg2[local5]);
					break;
				case 8219:
					local3.setAlphaBits(arg2[local5]);
					break;
				case 8222:
					local3.setAccumRedBits(arg2[local5]);
					break;
				case 8223:
					local3.setAccumGreenBits(arg2[local5]);
					break;
				case 8224:
					local3.setAccumBlueBits(arg2[local5]);
					break;
				case 8225:
					local3.setAccumAlphaBits(arg2[local5]);
					break;
				case 8226:
					local3.setDepthBits(arg2[local5]);
					break;
				case 8227:
					local3.setStencilBits(arg2[local5]);
				case 8237:
					break;
				case 8257:
					local3.setSampleBuffers(arg2[local5] != 0);
					break;
				case 8258:
					local3.setNumSamples(arg2[local5]);
					break;
				case 8368:
					if (arg2[local5] != 0) {
						local3.setPbufferFloatingPointBuffers(true);
					}
					break;
				default:
					throw new GLException("Unknown pixel format attribute " + arg0[local5]);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "<init>", descriptor = "(Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)V")
	protected Class195_Sub2(@OriginalArg(0) GLCapabilities arg0, @OriginalArg(1) GLCapabilitiesChooser arg1) {
		this.aGLCapabilities5 = (GLCapabilities) arg0.clone();
		this.aGLCapabilitiesChooser5 = arg1;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "setRealized", descriptor = "(Z)V")
	@Override
	public void setRealized(@OriginalArg(0) boolean arg0) {
		throw new GLException("Should not call this (should only be called for onscreen GLDrawables)");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "swapBuffers", descriptor = "()V")
	@Override
	public void swapBuffers() throws GLException {
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "getHDC", descriptor = "()J")
	public final long method4763() {
		return this.aLong1324;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawable", name = "choosePixelFormat", descriptor = "(Z)V")
	protected final void method4764() {
		@Pc(15) Class202 local15;
		@Pc(12) int local12;
		if ((local12 = WGL.GetPixelFormat(this.aLong1324)) != 0) {
			local15 = method4766();
			if (WGL.method4728(this.aLong1324, local12, Class202.method4631(), local15) == 0) {
				throw new GLException("Unable to describe pixel format " + local12 + " of window set by Java2D/OpenGL pipeline");
			}
			this.setChosenGLCapabilities(method4767(local15));
			this.aBoolean473 = true;
			return;
		}
		@Pc(48) GLCapabilities[] local48 = null;
		@Pc(50) int local50 = 0;
		local15 = method4766();
		@Pc(54) Class195_Sub2_Sub1 local54 = null;
		@Pc(56) GLContext_Sub1_Sub2 local56 = null;
		@Pc(58) Interface9 local58 = null;
		if (this.aGLCapabilities5.getSampleBuffers()) {
			local54 = new Class195_Sub2_Sub1();
			local56 = (GLContext_Sub1_Sub2) local54.createContext(null);
			if (local56 != null) {
				local56.makeCurrent();
				local58 = (Interface9) local56.method4759();
			}
		}
		@Pc(82) int local82 = -1;
		@Pc(88) boolean local88 = false;
		if (local58 != null) {
			try {
				@Pc(94) boolean local94 = local58.method4739("WGL_ARB_pixel_format");
				if (local94) {
					@Pc(100) boolean local100 = local58.method4739("WGL_ARB_multisample");
					@Pc(103) int[] local103 = new int[512];
					@Pc(106) int[] local106 = new int[512];
					@Pc(109) float[] local109 = new float[1];
					if (method4768(this.aGLCapabilities5, local103, local58, null)) {
						@Pc(119) int[] local119 = new int[256];
						@Pc(122) int[] local122 = new int[1];
						if (local58.method4735(this.aLong1324, local103, local109, local119, local122)) {
							local50 = local122[0];
							if (local50 > 0) {
								local82 = local119[0] - 1;
							}
						}
						@Pc(150) byte local150 = 0;
						local103[0] = 8192;
						if (local58.method4737(this.aLong1324, 0, 1, local103, local106)) {
							local50 = local106[0];
							@Pc(173) int local173 = local150 + 1;
							local103[0] = 8193;
							@Pc(178) int local178 = local173 + 1;
							local103[1] = 8195;
							@Pc(183) int local183 = local178 + 1;
							local103[2] = 8208;
							@Pc(188) int local188 = local183 + 1;
							local103[3] = 8226;
							@Pc(193) int local193 = local188 + 1;
							local103[4] = 8227;
							@Pc(198) int local198 = local193 + 1;
							local103[5] = 8209;
							@Pc(203) int local203 = local198 + 1;
							local103[6] = 8210;
							@Pc(208) int local208 = local203 + 1;
							local103[7] = 8211;
							@Pc(213) int local213 = local208 + 1;
							local103[8] = 8213;
							@Pc(218) int local218 = local213 + 1;
							local103[9] = 8215;
							@Pc(223) int local223 = local218 + 1;
							local103[10] = 8217;
							@Pc(228) int local228 = local223 + 1;
							local103[11] = 8219;
							@Pc(233) int local233 = local228 + 1;
							local103[12] = 8222;
							@Pc(238) int local238 = local233 + 1;
							local103[13] = 8223;
							@Pc(243) int local243 = local238 + 1;
							local103[14] = 8224;
							@Pc(248) int local248 = local243 + 1;
							local103[15] = 8225;
							if (local100) {
								local248++;
								local103[16] = 8257;
								local248++;
								local103[17] = 8258;
							}
							local48 = new GLCapabilities[local50];
							for (@Pc(267) int local267 = 0; local267 < local50; local267++) {
								if (!local58.method4737(this.aLong1324, local267 + 1, local248, local103, local106)) {
									throw new GLException("Error getting pixel format attributes for pixel format " + (local267 + 1) + " of device context");
								}
								local48[local267] = method4769(local103, local248, local106);
							}
							local88 = true;
						} else {
							@Pc(316) long local316 = (long) WGL.GetLastError();
							if (local316 != 0L) {
								throw new GLException("Unable to enumerate pixel formats of window using wglGetPixelFormatAttribivARB: error code " + WGL.GetLastError());
							}
						}
					}
				}
			} finally {
				local56.release();
				local56.destroy();
				local54.method4754();
			}
		}
		if (!local88) {
			local15 = method4765(this.aGLCapabilities5);
			local82 = WGL.method4727(this.aLong1324, local15) - 1;
			local50 = WGL.method4728(this.aLong1324, 1, 0, null);
			if (local50 == 0) {
				throw new GLException("Unable to enumerate pixel formats of window for GLCapabilitiesChooser");
			}
			local48 = new GLCapabilities[local50];
			for (@Pc(381) int local381 = 0; local381 < local50; local381++) {
				if (WGL.method4728(this.aLong1324, local381 + 1, Class202.method4631(), local15) == 0) {
					throw new GLException("Error describing pixel format " + (local381 + 1) + " of device context");
				}
				local48[local381] = method4767(local15);
			}
		}
		@Pc(426) int local426 = this.aGLCapabilitiesChooser5.chooseCapabilities(this.aGLCapabilities5, local48, local82);
		if (local426 < 0 || local426 >= local50) {
			throw new GLException("Invalid result " + local426 + " from GLCapabilitiesChooser (should be between 0 and " + (local50 - 1) + ")");
		}
		@Pc(455) GLCapabilities local455 = local48[local426];
		local426++;
		if (WGL.method4728(this.aLong1324, local426, Class202.method4631(), local15) == 0) {
			throw new GLException("Error re-describing the chosen pixel format: " + WGL.GetLastError());
		} else if (WGL.method4729(this.aLong1324, local426, local15)) {
			if (local455 == null) {
				this.setChosenGLCapabilities(method4767(local15));
			} else {
				this.setChosenGLCapabilities(local455);
			}
			this.aBoolean473 = true;
		} else {
			@Pc(497) long local497 = (long) WGL.GetLastError();
			throw new GLException("Unable to set pixel format " + local426 + " for device context " + toHexString(this.aLong1324) + ": error code " + local497);
		}
	}
}
