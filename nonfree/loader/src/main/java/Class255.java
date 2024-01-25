import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!f")
public final class Class255 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class255() throws Exception {
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

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(I)[I")
	public int[] method5751() {
		@Pc(9) DisplayMode[] local9 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(15) int[] local15 = new int[local9.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
			local15[local17 << 2] = local9[local17].getWidth();
			local15[(local17 << 2) + 1] = local9[local17].getHeight();
			local15[(local17 << 2) + 2] = local9[local17].getBitDepth();
			local15[(local17 << 2) + 3] = local9[local17].getRefreshRate();
		}
		return local15;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(B)V")
	public void method5752() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5753(null);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method5753(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(11) Field local11 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local11.setAccessible(true);
			@Pc(21) boolean local21 = (Boolean) local11.get(this.aGraphicsDevice1);
			if (local21) {
				local11.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(61) Field local61 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local61.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(68) Throwable local68) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(IIIIZLjava/awt/Frame;)V")
	public void method5754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Frame arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg4.setUndecorated(true);
		arg4.enableInputMethods(false);
		this.method5753(arg4);
		if (arg2 == 0) {
			@Pc(32) int local32 = this.aDisplayMode1.getRefreshRate();
			@Pc(36) DisplayMode[] local36 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < local36.length; local40++) {
				if (arg3 == local36[local40].getWidth() && arg0 == local36[local40].getHeight() && local36[local40].getBitDepth() == arg1) {
					@Pc(68) int local68 = local36[local40].getRefreshRate();
					if (!local38 || Math.abs(local68 - local32) < Math.abs(arg2 - local32)) {
						local38 = true;
						arg2 = local68;
					}
				}
			}
			if (!local38) {
				arg2 = local32;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg0, arg1, arg2));
	}
}
