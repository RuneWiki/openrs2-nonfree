import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class271 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class271() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Z)[I")
	public int[] method5876() {
		@Pc(8) DisplayMode[] local8 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(14) int[] local14 = new int[local8.length << 2];
		for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
			local14[local16 << 2] = local8[local16].getWidth();
			local14[(local16 << 2) + 1] = local8[local16].getHeight();
			local14[(local16 << 2) + 2] = local8[local16].getBitDepth();
			local14[(local16 << 2) + 3] = local8[local16].getRefreshRate();
		}
		return local14;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method5877(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5878(arg1);
		if (arg0 == 0) {
			@Pc(30) int local30 = this.aDisplayMode1.getRefreshRate();
			@Pc(34) DisplayMode[] local34 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < local34.length; local38++) {
				if (arg4 == local34[local38].getWidth() && local34[local38].getHeight() == arg2 && local34[local38].getBitDepth() == arg3) {
					@Pc(70) int local70 = local34[local38].getRefreshRate();
					if (!local36 || Math.abs(local70 - local30) < Math.abs(arg0 - local30)) {
						local36 = true;
						arg0 = local70;
					}
				}
			}
			if (!local36) {
				arg0 = local30;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg2, arg3, arg0));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method5878(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(64) Field local64 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local64.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(71) Throwable local71) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(I)V")
	public void method5879() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5878(null);
	}
}
